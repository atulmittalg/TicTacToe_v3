package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameBoardLayout = new char[3][3];
    private char currentTokenToPlay = 'X';

    public String playTurnAt(final int positionX, final int positionY) throws PositionAlreadyInUseException {
        if(gameBoardLayout[positionX][positionY] != '\0'){
            throw new PositionAlreadyInUseException(positionX, positionY);
        }
        gameBoardLayout[positionX][positionY] = currentTokenToPlay;
        if ((gameBoardLayout[0][0] == 'X') &&
                (gameBoardLayout[0][0] == gameBoardLayout[0][1]) &&
                (gameBoardLayout[0][0] == gameBoardLayout[0][2])) {
            return "X is the Winner";
        }
        setCurrentTokenToPlayValueForNextTurn();
        return null;
    }

    private void setCurrentTokenToPlayValueForNextTurn() {
        currentTokenToPlay = (currentTokenToPlay == 'X') ? 'O' : 'X';
    }

    public char getTokenAt(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }
}