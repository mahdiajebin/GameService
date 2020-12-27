package edu.citytech.rahman.games.connect4;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Connect4Controller {

    @GetMapping("/game/connect4")

    public Connect4Status playGame(@RequestParam String moves){

        Connect4Service service = new Connect4Service();
        Connect4Status status = service.getStatus(moves);

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
