package LLD_Quesitons_Practice.Design_Snake_And_Ladder;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Board board;
    Dice dice;
    boolean winner;

    Queue<Player> players;
    public Game(){
        board = new Board(10,5,6);
        dice = new Dice(2);
        winner = false;
        addPlayers();
    }

    public void addPlayers(){
        players = new LinkedList<>();
        for(int i=0;i<2;i++){
            players.add(new Player(i+1,0));
        }
    }

    public void playGame(){
        // run the game till no one will be winner.
        while(winner == false){
            Player player = CurrentPlayerTurn();
            System.out.println("Current player turn : "+ player.id + " | Player position : "+ player.currentPosition);
            int nextJumpValue = dice.rollDice();
            player.currentPosition +=nextJumpValue;
            // check if board has the snake or ladder on that player.
            if(player.currentPosition>=(board.cells.length*board.cells.length-1)){
                winner = true;
                break;
            }
            updatePlayerPosition(player);
            System.out.println("updated player position : "+ player.id + " | Player position : "+ player.currentPosition);
            if(player.currentPosition>=(board.cells.length*board.cells.length-1)){
                winner = true;
                break;
            }

        }
    }



    public void updatePlayerPosition(Player player){
        Cell cell = board.getCell(player.currentPosition);
        if(cell.jump !=null){
            // this position has the jump bro.
            System.out.println("************************** SNAKE OR LADDER****************"+ cell.jump.jumptype+ " "+ cell.jump.startPos+" "+ cell.jump.endPos);
            player.currentPosition = cell.jump.endPos;
        }
    }

    public Player CurrentPlayerTurn(){
        Player player = players.peek();
        players.add(player);
        players.remove();
        return player;
    }

}
