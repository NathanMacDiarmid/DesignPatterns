/** SYSC 3110A - Prof-Student-TA
 * Nathan MacDiarmid
 * 101098993
 */

import java.util.Date;

public class TeachingAssistant implements ProfListener {
    private String name;
    private Date midterm;

    public TeachingAssistant(String aName) {
        this.name = aName;
    }

    public String getName() {
        return this.name;
    }

    public void midtermDate(ProfEvent pe){
        this.midterm = pe.getMidtermDate();
        System.out.println(name + " : I have to proctor a midterm on " + this.midterm);
    }

    public void postponedMidterm(ProfEvent pe){
        this.midterm = pe.getMidtermDate();
        System.out.println(name + " : Now the midterm is on " + this.midterm);
    }
}
