package com.kata.tictactoe;

public class PositionAlreadyInUseException extends Exception {
    private int positionX, positionY;

    public PositionAlreadyInUseException(final int positionX, final int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String toString(){
        return ("Position Already Filled Exception at ("+ positionX + ", "+ positionY + "),");
    }
}