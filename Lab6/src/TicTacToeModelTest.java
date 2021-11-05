import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class TicTacToeModelTest {

    static TicTacToeModel tttm;

    @BeforeAll
    static void testInitialStatus() {
        tttm = new TicTacToeModel();
        assertEquals(TicTacToeModel.Status.UNDECIDED, tttm.getStatus());
    }

    @Test
    public void getStatus() {
        tttm = new TicTacToeModel();
        tttm.play(0, 0);
        assertEquals(TicTacToeModel.Status.UNDECIDED, tttm.getStatus());

        tttm.play(0,1);
        assertEquals(TicTacToeModel.Status.UNDECIDED, tttm.getStatus());

        tttm.play(1, 1);
        assertEquals(TicTacToeModel.Status.UNDECIDED, tttm.getStatus());

        tttm.play(0, 2);
        assertEquals(TicTacToeModel.Status.UNDECIDED, tttm.getStatus());

        tttm.play(2, 2);
        assertEquals(TicTacToeModel.Status.X_WON, tttm.getStatus());
    }
}