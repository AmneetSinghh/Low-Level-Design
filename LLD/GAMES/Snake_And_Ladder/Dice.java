package LLD.GAMES.Snake_And_Ladder;

public class Dice {
    int diceCount;// How many times we need to roll the dice, stored here.
    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public int rollDice(){
        int finalRollValue=0;
        int count= diceCount;
        while(count>0){
            int roll = getRandomNumber(1,6);
            finalRollValue +=roll;
            --count;
        }
        return finalRollValue;
    }
}
