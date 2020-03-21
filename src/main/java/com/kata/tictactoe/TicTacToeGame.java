package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameBoardLayout = new char[3][3];
    private char currentTokenToPlay = 'X';

    public void playTurnAt(final int positionX, final int positionY) {
        gameBoardLayout[positionX][positionY] = currentTokenToPlay;
        setCurrentTokenToPlayValueForNextTurn();
    }

    private void setCurrentTokenToPlayValueForNextTurn() {
        currentTokenToPlay = (currentTokenToPlay == 'X') ? 'O' : 'X';
    }

    public char getTokenAt(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }
}