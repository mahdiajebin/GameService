package edu.citytech.rahman.games.controller;


import edu.citytech.rahman.games.tictactoe.TicTacToeService;
import edu.citytech.rahman.games.tictactoe.TicTacToeStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicTacToeController {

    @GetMapping("/game/tictactoe")

    public TicTacToeStatus playGame(@RequestParam String moves){

        TicTacToeService service = new TicTacToeService();
        TicTacToeStatus status = service.getStatus(moves);

        return status;
    }



//    public Map<String,Object>getTicTacToeInfo(){
//        Map<String,Object> map = new HashMap<>();
//
//        boolean isWinner = true;
//        int[] position = {0,1,2};
//        String whoWon = "X";
//
//        map.put("isWinner ", isWinner);
//        map.put("position: ", position);
//        map.put("whoWon ", whoWon);
//
//
//
//        return map;
//    }


}
