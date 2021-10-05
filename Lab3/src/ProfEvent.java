/** SYSC 3110A - Prof-Student-TA
 * Nathan MacDiarmid
 * 101098993
 */

import java.util.*;

public class ProfEvent extends java.util.EventObject {

    private final Date midtermDate;

    public ProfEvent(Prof p, Date midterm) {
        super(p);
        midtermDate = midterm;
    }

    public Date getMidtermDate() {
        return this.midtermDate;
    }

    public Prof getProf() {
        return (Prof) this.getSource();
    }
}
