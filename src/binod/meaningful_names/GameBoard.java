package binod.meaningful_names;
import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    static List<Cell> gameBoard = new ArrayList<Cell>();

    public static void main(String[] args) {
        List<Cell> list = getFlaggedCells();
        System.out.println(list);
    }

    public static List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}

class Cell {

    int STATUS_VALUE = 0;

    int FLAGGED = 4;

    public boolean isFlagged() {
        return STATUS_VALUE == FLAGGED;
    }
}
