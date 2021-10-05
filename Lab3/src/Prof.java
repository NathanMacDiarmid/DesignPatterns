/** SYSC 3110A - Prof-Student-TA
 * Nathan MacDiarmid
 * 101098993
 */

import java.util.ArrayList;
import java.util.Date;

public class Prof {
    private String name;
    private Date midtermDate;
    private ArrayList<ProfListener> profListeners;

    public Prof(String aName) {
        this.name = aName;
        this.profListeners = new ArrayList<>();
    }

    public Date getMidterm() {
        return this.midtermDate;
    }

    public String getName() {
        return this.name;
    }

    public void setMidterm(Date date, Prof prof) {
        this.midtermDate = date;
        ProfEvent pe = new ProfEvent(prof, date);
        for (ProfListener s: this.profListeners) {
            s.midtermDate(pe);
        }
    }

    public void postponeMidterm(Date date, Prof prof){
        this.midtermDate = date;
        ProfEvent pe = new ProfEvent(prof, date);
        for (ProfListener s: this.profListeners) {
            s.postponedMidterm(pe);
        }
    }

    public void addProfListener(ProfListener pl){
        this.profListeners.add(pl);
    }

    public void removeProfListener(ProfListener pl){
        this.profListeners.remove(pl);
    }


    public static void main(String[] args) {

        Prof p = new Prof("Babak");
        Student s = new Student("Homer");
        Student s2 = new Student("Bart");
        TeachingAssistant ta = new TeachingAssistant("Michael");


        p.addProfListener(s);
        p.addProfListener(s2);
        p.addProfListener(ta);

        Date midterm = new Date();
        p.setMidterm(midterm, p);

        p.postponeMidterm(new Date(midterm.getTime() + 1000000000), p);
    }

}
