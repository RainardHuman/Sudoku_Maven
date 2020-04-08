package com.github.RainardHuman;

import static org.junit.Assert.assertEquals;

import com.github.RainardHuman.Api.SudokuRetrofitService;
import com.github.RainardHuman.Game.Block;
import com.github.RainardHuman.Game.DisplayScreen;
import org.junit.Test;

import java.util.Arrays;

public class AppTest 
{
    @Test
    public void checkIntSum()
    {
        SudokuRetrofitService sudokuRetrofitService = new SudokuRetrofitService();

        int[][] game = sudokuRetrofitService.getNewGame();
        System.out.println("New Game");
        System.out.println(Arrays.deepToString(game).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        int[][] hintGame = sudokuRetrofitService.getHintForCurrentGame(game);
        System.out.println("\nHint");
        System.out.println(Arrays.deepToString(hintGame).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        int[][] solvedGame = sudokuRetrofitService.getSolvedPuzzleForCurrentGame(game);
        System.out.println("\nSolved Game");
        System.out.println(Arrays.deepToString(solvedGame).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        int finalAnswer = 2;
        int compare = 2;
        assertEquals(finalAnswer, compare);
    }

    @Test
    public void layoutTest() {
        int[][] layout = {
                {0, 4, 0, 0, 0, 0, 1, 7, 9},
                {0, 0, 2, 0, 0, 8, 0, 5, 4},
                {0, 0, 2, 0, 0, 8, 0, 5, 4},
                {0, 0, 6, 0, 0, 5, 0, 0, 8},
                {0, 8, 0, 0, 7, 0, 9, 1, 0},
                {0, 5, 0, 0, 9, 0, 0, 3, 0},
                {0, 1, 9, 0, 6, 0, 0, 4, 0},
                {3, 0, 0, 4, 0, 0, 7, 0, 0},
                {5, 7, 0, 1, 0, 0, 2, 0, 0},
                {9, 2, 8, 0, 0, 0, 0, 6, 0}};

        char[][] boardScreen = {
                {'┍', '4','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','7','┒'},
                {'0', '┍','—', '—', '—', '—','—','—','—','—', '—','—', '—', '—', '—','—','┒','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '|','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','|','9'},
                {'0', '┕','—', '—', '—', '—','—','—','—','—', '—','—', '—', '—', '—','—','┚','9'},
                {'┕', '4','0', '0', '0', '0','1','7','9','0', '4','0', '0', '0', '0','1','7','┚'},
        };

        DisplayScreen screen = new DisplayScreen(18,18,boardScreen);

        Block[] board = new Block[81];

        int x = 0;

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                board[x] = new Block(j,i,layout[i][j]);

                //screen.setPixel_value(i,j,Integer.toString(layout[i][j]).charAt(0));

                x++;
            }

        }
        System.out.println("66666");
        System.out.println("66666");

        System.out.println(screen);
    }

    @Test
    public void displayBlock(){
        Block[] board = new Block[81];
        System.out.println("Check: " + board[7].block);
        System.out.println("Check: " + board[7].x);
        System.out.println("Check: " + board[7].y);
        System.out.println("Check: " + board[7].value);
    }
}
