package edu.citytech.rahman.games.tictactoe;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//logic to calculate winner' find who won
public class TicTacToeService {

    //list is  a dynamic array
    //defined
    static List<TicTacToeWinningCombo> list = new ArrayList<>();


//loading data
    static {
    loadTest();


    }

    private static void loadTest(){
        try {

            var file = TicTacToeService.class.getClassLoader().getResource("TicTacToeWinningCombination").toURI();
            Path path = Paths.get(file);
            String[] lines = Files.readAllLines(path).toArray(String[]::new);


            for (String row: lines ) {
                int w1, w2, w3;
                String columns[] = row.split(",");
                w1 = Integer.parseInt(columns[0]);
                w2 = Integer.parseInt(columns[1]);
                w3 = Integer.parseInt(columns[2]);
                TicTacToeWinningCombo status = new TicTacToeWinningCombo(w1,w2,w3);
                list.add(status);
                System.out.println(status);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }





   // http://localhost:9615/game/tictactoe?moves=XXX?OOXOX
    public TicTacToeStatus getStatus(String moves){

        char[] allMoves = moves.toCharArray();

        TicTacToeStatus status = new TicTacToeStatus(false,new int[0] , "?");
        //status.setPosition(null);


        for (TicTacToeWinningCombo wc:
            list ) {
            if( allMoves[wc.w1] == allMoves[wc.w2] && allMoves[wc.w2] == allMoves[wc.w3] && allMoves[wc.w1] != '?'){
                status = new TicTacToeStatus(true,new int[] {wc.w1,wc.w2,wc.w3} , allMoves[wc.w1] + "");
                break;
            }
        }



        return status;
    }





}
