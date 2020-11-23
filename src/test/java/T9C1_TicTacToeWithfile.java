import edu.citytech.rahman.games.tictactoe.TicTacToeService;

import edu.citytech.rahman.games.tictactoe.TicTacToeWinningCombo;
import org.junit.Test;


import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;




public class T9C1_TicTacToeWithfile {


    @Test
    public void e01(){
        try {

            URI file = this.getClass().getClassLoader().getResource("TicTacToeWinningCombination").toURI();
            Path path = Paths.get(file);
            String[] lines = Files.readAllLines(path).toArray(String[]::new);


            for (String row: lines ) {
                int w1, w2, w3;
                String columns[] = row.split(",");
                w1 = Integer.parseInt(columns[0]);
                w2 = Integer.parseInt(columns[1]);
                w3 = Integer.parseInt(columns[2]);
                TicTacToeWinningCombo status = new TicTacToeWinningCombo(w1,w2,w3);
                System.out.println(status);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
