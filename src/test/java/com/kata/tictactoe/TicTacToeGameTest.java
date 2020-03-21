package com.kata.tictactoe;

import org.junit.Assert;
import org.junit.Test;

public class TicTacToeGameTest {
    @Test
    public void shouldBeAbleToCreateTicTacToeObject(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Assert.assertNotNull(ticTacToeGame);
    }

    @Test
    public void shouldAssignTokenXWhenFirstTurnIsPlayed(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0,0);
        Assert.assertEquals('X', ticTacToeGame.getTokenAt(0,0));
    }
}