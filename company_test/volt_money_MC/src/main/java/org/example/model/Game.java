package org.example.model;

import java.util.*;

public class Game {
    Board[] board;
    List<Player> playerList;             // playerDatabase.
    Dice dice;
    Queue playerTurn = new ArrayDeque(); //

    public Game(int boardSize, int noOfPlayer){
        board = new Board[boardSize];
        for(int i=0;i<boardSize;i++){
            boardSize[i] = new Jump();// can be a snake/ladder.
        }
        playerList = new ArrayList<>();
        dice = new Dice();
    }

    public int playerTurn(){

    }

    public void startGame(){
        // player turn
        // roll dice 2 times.
        // need jump.  ( snake/ ladder/ next )
        // update player position.
        // check winner.
    }

    public void updatePlayerPos(Player player, Jump jump){

    }

    public void checkWinner(Player player){

    }


    public Player choosePlayer(){
        Player player = playerTurn.peek();
        playerTurn.poll();
        playerTurn.add(player);
        return player;
    }


}
