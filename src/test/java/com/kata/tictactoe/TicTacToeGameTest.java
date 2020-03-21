package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TicTacToeGameTest {

    private TicTacToeGame ticTacToeGame;

    @Before
    public void initializeTicTacToeGameObject(){
        ticTacToeGame = new TicTacToeGame();
    }

    @Test
    public void shouldBeAbleToCreateTicTacToeObject(){
        assertNotNull(ticTacToeGame);
    }

    @Test
    public void shouldAssignTokenXWhenFirstTurnIsPlayed(){
        ticTacToeGame.playTurnAt(0,0);
        assertEquals('X', ticTacToeGame.getTokenAt(0,0));
    }
}