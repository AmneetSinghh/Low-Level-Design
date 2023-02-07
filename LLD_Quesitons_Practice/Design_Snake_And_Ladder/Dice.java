package LLD_Quesitons_Practice.Design_Snake_And_Ladder;

public class Dice {
    int diceCount;
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
