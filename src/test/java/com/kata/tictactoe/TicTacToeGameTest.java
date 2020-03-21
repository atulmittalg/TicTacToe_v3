package com.kata.tictactoe;

import org.junit.Assert;
import org.junit.Test;

public class TicTacToeGameTest {
    @Test
    public void shouldBeAbleToCreateTicTacToeObject(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Assert.assertNotNull(ticTacToeGame);
    }
}