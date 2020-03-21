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
    public void shouldAssignTokenXWhenFirstTurnIsPlayed() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        assertEquals('X', ticTacToeGame.getTokenAt(0,0));
    }

    @Test
    public void shouldAssignToken0WhenSecondTurnIsPlayed() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        assertEquals('O', ticTacToeGame.getTokenAt(0,1));
    }

    @Test
    public void shouldAssignTokenXWhenThirdTurnIsPlayed() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(0,2);
        assertEquals('X', ticTacToeGame.getTokenAt(0,2));
    }

    @Test(expected = PositionAlreadyInUseException.class)
    public void shouldThrowPositionAlreadyFilledExceptionWhenPlayingAtAUsedPosition() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,0);
    }

    @Test
    public void shouldDeclareWinnerIsXWhenFirstRowIsAllTokenX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(1,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(2,0);
        assertEquals("X is the Winner", ticTacToeGame.playTurnAt(0,2));
    }

    @Test
    public void shouldDeclareWinnerIsXWhenSecondRowIsAllTokenX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(1,0);
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(1,1);
        ticTacToeGame.playTurnAt(2,0);
        assertEquals("X is the Winner", ticTacToeGame.playTurnAt(1,2));
    }

    @Test
    public void shouldDeclareWinnerIsOWhenFirstRowIsAllTokenX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(1,0);
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(2,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(2,2);
        assertEquals("O is the Winner", ticTacToeGame.playTurnAt(0,2));
    }

    @Test
    public void shouldDeclareWinnerIsXWhenFirstColumnIsAllTokenX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(1,0);
        ticTacToeGame.playTurnAt(0,2);
        assertEquals("X is the Winner", ticTacToeGame.playTurnAt(2,0));
    }

    @Test
    public void shouldDeclareWinnerIsOWhenFirstColumnIsAllTokenO() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,2);
        ticTacToeGame.playTurnAt(1,0);
        ticTacToeGame.playTurnAt(2,2);
        assertEquals("O is the Winner", ticTacToeGame.playTurnAt(2,0));
    }

    @Test
    public void shouldDeclareWinnerIsXWhenLeftToRightDiagonalIsAllTokenX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(1,1);
        ticTacToeGame.playTurnAt(0,2);
        assertEquals("X is the Winner", ticTacToeGame.playTurnAt(2,2));
    }

    @Test
    public void shouldDeclareWinnerIsXWhenRightToLeftDiagonalIsAllTokenX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,2);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(1,1);
        ticTacToeGame.playTurnAt(0,0);
        assertEquals("X is the Winner", ticTacToeGame.playTurnAt(2,0));
    }

}