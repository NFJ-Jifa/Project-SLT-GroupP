public class Main {
  public boolean isCellEmpty(int x, int y) {
    return cells[x][y] == ' ';
}

public void place(int x, int y, char marker) {
    if (isCellEmpty(x, y)) {
        cells[x][y] = marker;
    }
}




  public void start() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        board.print();
        System.out.println("Current Player: " + currentPlayer.getMarker());
        System.out.print("row (0-2): ");
        int row = scanner.nextInt();
        System.out.print("column (0-2): ");
        int col = scanner.nextInt();

        // Check if the selected cell is empty
        if (board.isCellEmpty(row, col)) {
            // Place the player's marker on the board
            board.place(row, col, currentPlayer.getMarker());
            // Further logic...
        } else {
            System.out.println("Cell is not empty! Try again.");
        }
    }
}
}
