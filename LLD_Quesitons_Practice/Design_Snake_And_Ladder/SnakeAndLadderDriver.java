package LLD_Quesitons_Practice.Design_Snake_And_Ladder;

// for reference https://gitlab.com/shrayansh8/interviewcodingpractise/-/tree/main/src/LowLevelDesign/LLDSnakeLadder       this code is almost same.

// Models should be independent classes with no business logic.
public class SnakeAndLadderDriver {
    public static void main(String args[]){
        // inialitize the game
        // start the game.
        Game game = new Game();
        game.playGame();;
    }
}
