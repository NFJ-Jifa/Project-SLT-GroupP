public class Main {
  public boolean isCellEmpty(int x, int y) {
    return cells[x][y] == ' ';
}

public void place(int x, int y, char marker) {
    if (isCellEmpty(x, y)) {
        cells[x][y] = marker;
    }
}
}
