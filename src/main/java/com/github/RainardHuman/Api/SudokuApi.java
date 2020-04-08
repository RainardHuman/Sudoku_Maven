package com.github.RainardHuman.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SudokuApi {
    @GET("new")
    Call<String> getNewGame();

    @GET("hint/{puzzleInDotted}")
    Call<String> getHintForGame(@Path("puzzleInDotted") String puzzleInDotted);

    @GET("solve/{puzzleInDotted}")
    Call<String> getSolvedGame(@Path("puzzleInDotted") String puzzleInDotted);
}
