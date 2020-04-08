package com.github.RainardHuman.Api;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

public class SudokuRetrofitService {
    SudokuApi sudokuApi;

    public SudokuRetrofitService() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(ScalarsConverterFactory.create()) // scalar for primitive and gson for json retrievals.
                .baseUrl("https://agarithm.com/sudoku/")
                .build();

        sudokuApi = retrofit.create(SudokuApi.class);
    }

    public int[][] getNewGame() {
        return transformStringToGame(executeCall(sudokuApi.getNewGame()));
    }

    public int[][] getHintForCurrentGame(int[][] game) {
        return transformStringToGame(executeCall(sudokuApi.getHintForGame(transformGameToString(game))));
    }

    public int[][] getSolvedPuzzleForCurrentGame(int[][] game) {
        return transformStringToGame(executeCall(sudokuApi.getSolvedGame(transformGameToString(game))));
    }

    public String executeCall(Call<String> stringCall) {
        try {
            Response<String> stringResponse = stringCall.execute();
            return stringResponse.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private int[][] transformStringToGame(String dottedBoard) {
        int[][] game = new int[9][9];
        int countX = 0;
        int countY = 0;

        for (char value : dottedBoard.toCharArray()) {
            if (countY == 9) {
                countX++;
                countY = 0;
            }
            if(value == '.') {
                game[countY][countX] = 0;
            } else {
                game[countY][countX] = (int)value - 48;
            }
            countY++;
        }
        return game;
    }

    private String transformGameToString(int[][] board) {
        StringBuilder dottedBoard = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == 0) {
                    dottedBoard.append(".");
                } else {
                    dottedBoard.append(board[j][i]);
                }
            }
        }
        return dottedBoard.toString();
    }
}
