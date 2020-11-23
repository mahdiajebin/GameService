import edu.citytech.rahman.games.tictactoe.TicTacToeService;
import edu.citytech.rahman.games.tictactoe.TicTacToeStatus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class T3_TicTacToe {


    @Test
    public void e01(){
        //  http://localhost:9615/game/tictactoe?moves=XXX?OOXOX
       TicTacToeService ts = new TicTacToeService();
       String moves = "X?O?OOXXX";

        TicTacToeStatus status = ts.getStatus(moves);
        String expected="X";
        String actual = status.getWhoWon();
        assertEquals(expected, actual);

        System.out.println(status);


    }

    @Test
    public void e01B(){
        //  http://localhost:9615/game/tictactoe?moves=OOO?OOXOX
        TicTacToeService ts = new TicTacToeService();
        String moves = "XX??OOXXX";

        TicTacToeStatus status = ts.getStatus(moves);
        boolean expected = true;
        boolean actual = status.isWinner();
        assertEquals(expected, actual);

        System.out.println(status);


    }
    @Test
    public void e01C(){
        //  http://localhost:9615/game/tictactoe?moves=?????OXOX
        TicTacToeService ts = new TicTacToeService();
        String moves = "?OOO?O???";

        TicTacToeStatus status = ts.getStatus(moves);
        boolean expected = false;
        boolean actual = status.isWinner();
        System.out.println(status);
        assertEquals(expected, actual);




    }

    @Test
    public void e02(){
        //  http://localhost:9615/game/tictactoe?moves=XXX?OOXOX
        TicTacToeService ts = new TicTacToeService();
        String moves = "OOO?OXOOO";

        TicTacToeStatus status = ts.getStatus(moves);
        String expected="O";
        String actual = status.getWhoWon();
        assertEquals(expected, actual);

        System.out.println(status);


    }


}