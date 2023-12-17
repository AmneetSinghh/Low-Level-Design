package LLD.GAMES.Snake_And_Ladder;

public interface BoardI {
    public void initilizeBoard(int boardCount);
    public void addSnakeAndLadders(int snakes, int ladders);
    Cell getCell(int position);// get current cell
}
