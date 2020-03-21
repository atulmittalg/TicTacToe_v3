package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameBoardLayout = new char[3][3];
    private char currentTokenToPlay = 'X';

    public String playTurnAt(final int positionX, final int positionY) throws PositionAlreadyInUseException {
        if(gameBoardLayout[positionX][positionY] != '\0'){
            throw new PositionAlreadyInUseException(positionX, positionY);
        }
        gameBoardLayout[positionX][positionY] = currentTokenToPlay;
        if (isXWinnerByRow()) {
            return "X is the Winner";
        }
        if (isOWinnerByRow()) {
            return "O is the Winner";
        }
        setCurrentTokenToPlayValueForNextTurn();
        return null;
    }

    private boolean isOWinnerByRow() {
        for(int row = 0; row <3 ; row++){
            if ((gameBoardLayout[row][0] == 'O') &&
                    (gameBoardLayout[row][0] == gameBoardLayout[row][1]) &&
                    (gameBoardLayout[row][0] == gameBoardLayout[row][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean isXWinnerByRow() {
        for(int row = 0; row <3 ; row++){
            if ((gameBoardLayout[row][0] == 'X') &&
                    (gameBoardLayout[row][0] == gameBoardLayout[row][1]) &&
                    (gameBoardLayout[row][0] == gameBoardLayout[row][2])) {
                return true;
            }
        }
        return false;
    }

    private void setCurrentTokenToPlayValueForNextTurn() {
        currentTokenToPlay = (currentTokenToPlay == 'X') ? 'O' : 'X';
    }

    public char getTokenAt(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }
}