package LLD.GAMES.Snake_And_Ladder;

public class Board {
    Cell[][] cells;
    int snakes;
    public Board(int boardCount, int snakes, int ladders){
        initilizeBoard(boardCount);
        addSnakeAndLadders(snakes,ladders);
    }

    public void initilizeBoard(int boardCount){
        cells = new Cell[boardCount][boardCount];
        for(int i=0;i<boardCount;i++){
            for(int j=0;j<boardCount;j++){
                Cell cell = new Cell();// empty cell
                this.cells[i][j]=cell;
            }
        }
    }

    public void addSnakeAndLadders(int snakes, int ladders){
        // add snakes.
        while(snakes>0){
            int start = getRandomNumber(0,cells.length*cells.length-1);
            int end = getRandomNumber(0,cells.length*cells.length-1);
            if(start<=end){
                continue;
            }
            cells[start/cells.length][start%cells.length]=addJump(start,end,JumpType.SNAKE);
            System.out.println("Board snake added : "+ start+" "+ end);
            --snakes;
        }

        // add ladders.
        while(ladders>0){
            int start = getRandomNumber(0,cells.length*cells.length-1);
            int end = getRandomNumber(0,cells.length*cells.length-1);
            if(start>=end){
                continue;
            }
            if(cells[start/cells.length][start%cells.length].jump == null){// snake and ladders should not be on the same cell.
                System.out.println("Board ladder added : "+ start+" "+ end);
                cells[start/cells.length][start%cells.length] =addJump(start,end,JumpType.LADDER);
                --ladders;
            }
        }

        // board size.
        System.out.println("S");;
    }

    Cell addJump(int start, int end, JumpType jumpType){
        Cell cell = new Cell();
        Jump jump = new Jump();
        jump.startPos = start;
        jump.endPos = end;
        jump.jumptype  = jumpType;
        cell.jump = jump;
        return cell;
    }

    Cell getCell(int position){
        int row = position/cells.length;
        int col = position% cells.length;
        return cells[row][col];
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
