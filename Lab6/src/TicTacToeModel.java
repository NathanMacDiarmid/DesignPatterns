import java.util.ArrayList;
import java.util.List;

public class TicTacToeModel {


    public static int SIZE = 3;
    public static boolean X = true;
    public static boolean O = false;

    public enum Status {X_WON, O_WON, TIE, UNDECIDED};

    private char[][] grid;
    private boolean turn;
    private int turnCounter;
    private Status status;
    private List<TicTacToeView> views;

    public TicTacToeModel() {
        grid = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = ' ';
            }
        }
        turn = X;
        turnCounter = 0;
        status = Status.UNDECIDED;
        views = new ArrayList<>();
    }

    public void addTicTacToeView(TicTacToeView view) {
        views.add(view);
    }

    public void removeTicTacToeView(TicTacToeView view) {
        views.remove(view);
    }

    private void changeTurn() {
        turn = !turn;
    }

    public Status getStatus() {return status;}

    private void updateStatus() {
        // X's
        if (grid[SIZE - 3][SIZE - 3] == 'X') {
            if (grid[SIZE - 2][SIZE - 3] == 'X') {
                if (grid[SIZE - 1][SIZE - 3] == 'X') {
                    status = Status.X_WON;
                }
            }
            else if (grid[SIZE - 2][SIZE - 2] == 'X') {
                if (grid[SIZE - 1][SIZE - 1] == 'X') {
                    status = Status.X_WON;
                }
            }
            else if (grid[SIZE - 3][SIZE - 2] == 'X') {
                if (grid[SIZE - 3][SIZE - 1] == 'X') {
                    status = Status.X_WON;
                }
            }
        }
        else if (grid[SIZE - 3][SIZE - 2] == 'X') {
            if (grid[SIZE - 2][SIZE - 2] == 'X') {
                if (grid[SIZE - 1][SIZE - 2] == 'X') {
                    status = Status.X_WON;
                }
            }
        }
        else if (grid[SIZE - 1][SIZE - 1] == 'X') {
            if (grid[SIZE - 2][SIZE - 1] == 'X') {
                if (grid[SIZE - 3][SIZE - 1] == 'X') {
                    status = Status.X_WON;
                }
            }
            else if (grid[SIZE - 1][SIZE - 2] == 'X') {
                if (grid[SIZE - 1][SIZE - 3] == 'X') {
                    status = Status.X_WON;
                }
            }
        }

        // O's
        if (grid[SIZE - 3][SIZE - 3] == 'O') {
            if (grid[SIZE - 2][SIZE - 3] == 'O') {
                if (grid[SIZE - 1][SIZE - 3] == 'O') {
                    status = Status.O_WON;
                }
            }
            else if (grid[SIZE - 2][SIZE - 2] == 'O') {
                if (grid[SIZE - 1][SIZE - 1] == 'O') {
                    status = Status.O_WON;
                }
            }
            else if (grid[SIZE - 3][SIZE - 2] == 'O') {
                if (grid[SIZE - 3][SIZE - 1] == 'O') {
                    status = Status.O_WON;
                }
            }
        }
        else if (grid[SIZE - 3][SIZE - 2] == 'O') {
            if (grid[SIZE - 2][SIZE - 2] == 'O') {
                if (grid[SIZE - 1][SIZE - 2] == 'O') {
                    status = Status.O_WON;
                }
            }
        }
        else if (grid[SIZE - 1][SIZE - 1] == 'O') {
            if (grid[SIZE - 2][SIZE - 1] == 'O') {
                if (grid[SIZE - 3][SIZE - 1] == 'O') {
                    status = Status.O_WON;
                }
            }
            else if (grid[SIZE - 1][SIZE - 2] == 'O') {
                if (grid[SIZE - 1][SIZE - 3] == 'O') {
                    status = Status.O_WON;
                }
            }
        }
        if (turnCounter == 9) {
            status = Status.TIE;
        }
    }

    public boolean getTurn() {return turn;}

    public void play(int x, int y) {
        if (grid[x][y] != ' ') return;
        grid[x][y] = turn? 'X' : 'O';
        this.turnCounter++;
        updateStatus();
        for (TicTacToeView view: views) {
            view.handleTicTacToeStatusUpdate(this, status, x, y);
        }
        changeTurn();
    }
}

