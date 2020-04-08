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

    public String getNewGame() {
        return executeCall(sudokuApi.getNewGame());
    }

    public String getHintForCurrentGame(String gameInDotted) {
        return executeCall(sudokuApi.getHintForGame(gameInDotted));
    }

    public String getSolvedPuzzleForCurrentGame(String gameInDotted) {
        return executeCall(sudokuApi.getSolvedGame(gameInDotted));
    }

    public String executeCall(Call<String> stringCall) {
        try {
            Response<String> stringResponse = stringCall.execute(); // execute the call to the web API
            return stringResponse.body(); // gets the response from the web API's body.
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
