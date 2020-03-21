package com.kata.tictactoe;

public class TicTacToeGame {
    private final char TOKEN_X = 'X';
    private final char EMPTY_POSITION = '\0';
    private char[][] gameBoardLayout = new char[3][3];
    private char currentTokenToPlay = TOKEN_X;

    public String playTurnAt(final int positionX, final int positionY) throws PositionAlreadyInUseException {
        if(gameBoardLayout[positionX][positionY] != EMPTY_POSITION){
            throw new PositionAlreadyInUseException(positionX, positionY);
        }
        gameBoardLayout[positionX][positionY] = currentTokenToPlay;
        if (isWinnerByRow()) {
            return (currentTokenToPlay + " is the Winner");
        }
        if (isWinnerByColumn()) {
            return (currentTokenToPlay + " is the Winner");
        }
        if(isWinnerByLeftToRightDiagonal()) {
            return (currentTokenToPlay + " is the Winner");
        }
        if(isWinnerByRightToLeftDiagonal()) {
            return (currentTokenToPlay + " is the Winner");
        }
        setCurrentTokenToPlayValueForNextTurn();
        return null;
    }

    private boolean isWinnerByRightToLeftDiagonal() {
        return (getTokenAt(0, 2) != EMPTY_POSITION) &&
                (getTokenAt(0, 2) == getTokenAt(1, 1)) &&
                (getTokenAt(0, 2) == (getTokenAt(2, 0)));
    }

    private boolean isWinnerByLeftToRightDiagonal() {
        return (getTokenAt(0, 0) != EMPTY_POSITION) &&
                (getTokenAt(0, 0) == getTokenAt(1, 1)) &&
                (getTokenAt(0, 0) == (getTokenAt(2, 2)));
    }

    private boolean isWinnerByColumn(){
        for(int column = 0; column <3 ; column++){
            if ((getTokenAt(0, column) != EMPTY_POSITION) &&
                    (getTokenAt(0, column) == getTokenAt(1, column)) &&
                    (getTokenAt(0, column) == getTokenAt(2, column))) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByRow() {
        for(int row = 0; row <3 ; row++){
            if ((getTokenAt(row,0) != EMPTY_POSITION) &&
                    (getTokenAt(row,0) == getTokenAt(row,1)) &&
                    (getTokenAt(row,0) == (getTokenAt(row,2)))) {
                return true;
            }
        }
        return false;
    }

    private void setCurrentTokenToPlayValueForNextTurn() {
        currentTokenToPlay = (currentTokenToPlay == TOKEN_X) ? 'O' : TOKEN_X;
    }

    public char getTokenAt(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }
}