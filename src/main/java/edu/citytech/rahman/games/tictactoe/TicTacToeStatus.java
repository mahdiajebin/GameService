package edu.citytech.rahman.games.tictactoe;

import java.util.Arrays;



public class TicTacToeStatus {
    private boolean isWinner;
    private int[] position;
    private  String whoWon;

    public TicTacToeStatus(boolean isWinner, int[] position, String whoWon) {
        this.isWinner = isWinner;
        this.position = position;
        this.whoWon = whoWon;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    @Override
    public String toString() {
        return "TicTacToeService{" +
                "isWinner=" + isWinner +
                ", position=" + Arrays.toString(position) +
                ", whoWon='" + whoWon + '\'' +
                '}';
    }
}
//    @Override
//    public String toString() {
//        return "Connect4" +
//                "isWinner=" + isWinner +
//                ", position=" + Arrays.toString(position) +
//                ", whoWon='" + whoWon + '\'' +
//                '}';
//    }