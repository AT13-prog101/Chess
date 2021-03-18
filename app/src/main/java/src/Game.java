package src;

public class Game {
    Player player1= new Player("player1", "white");
    Player player2= new Player("player2", "black");
    Game(){
    Chessboard.printBoard();
    }
    void gameInit(){
        player1.makeMove();
//        while (true) {
//            player1.makeMove();
//            player2.makeMove();
//        }
    }
}
