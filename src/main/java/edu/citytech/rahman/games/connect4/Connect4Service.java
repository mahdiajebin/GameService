package edu.citytech.rahman.games.connect4;

import edu.citytech.rahman.games.tictactoe.TicTacToeService;
import edu.citytech.rahman.games.tictactoe.TicTacToeStatus;
import edu.citytech.rahman.games.tictactoe.TicTacToeWinningCombo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Connect4Service {

    //list is  a dynamic array
    //defined
    static List<connect4WinningCombo> list = new ArrayList<>();


    //loading data
    static {
        loadTest();


    }

    private static void loadTest(){
        try {

            var file = Connect4Service.class.getClassLoader().getResource("connect4WinningCombination").toURI();
            Path path = Paths.get(file);
            String[] lines = Files.readAllLines(path).toArray(String[]::new);


            for (String row: lines ) {
                int w1, w2, w3, w4;
                String columns[] = row.split(",");
                w1 = Integer.parseInt(columns[0]);
                w2 = Integer.parseInt(columns[1]);
                w3 = Integer.parseInt(columns[2]);
                w4= Integer.parseInt(columns[3]);

                connect4WinningCombo status = new connect4WinningCombo(w1,w2,w3,w4);
                list.add(status);
                System.out.println(status);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    // http://localhost:9615/game/tictactoe?moves=XXX?OOXOX
    public Connect4Status getStatus(String moves){

        char[] allMoves = moves.toCharArray();

        Connect4Status status = new Connect4Status(false,new int[0] , "?");
        //status.setPosition(null);


        for (connect4WinningCombo wc:
                list ) {

            if( allMoves[wc.w1] == allMoves[wc.w2] && allMoves[wc.w2] == allMoves[wc.w3] && allMoves[wc.w3] == allMoves[wc.w4] && allMoves[wc.w1] != '?'){

                status = new Connect4Status(true,new int[] {wc.w1,wc.w2,wc.w3, wc.w4} , allMoves[wc.w1] + "");
                break;
            }

        }



        return status;
    }












}
