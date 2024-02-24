package LLD.GAMES.Snake_And_Ladder;


import lombok.Getter;

@Getter
public class Player {
    int id;
    int currentPosition;

    public Player (int id, int currentPosition){
        this.id = id;
        this.currentPosition = currentPosition;
    }

}
