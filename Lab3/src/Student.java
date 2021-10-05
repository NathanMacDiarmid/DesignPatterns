/** SYSC 3110A - Prof-Student-TA
 * Nathan MacDiarmid
 * 101098993
 */

import java.util.Date;

public class Student implements ProfListener{
    private String name;
    private Date midterm;

    public Student(String aName) {
        this.name = aName;
    }

    public String getName() {
        return this.name;
    }

    private void study(ProfEvent pe){
        this.midterm = pe.getMidtermDate();
        System.out.println(name + " : Doh! I have to study hard for my midterm on " + this.midterm);
    }

    private void party(ProfEvent pe){
        this.midterm = pe.getMidtermDate();
        System.out.println(name + " : Alright! I get to party since my midterm isn't until " + this.midterm);
    }

    public void midtermDate(ProfEvent pe) {
        System.out.println("Professor " + pe.getProf().getName() + " has assigned a midterm");
        this.study(pe);
    }

    public void postponedMidterm(ProfEvent pe) {
        System.out.println("Professor " + pe.getProf().getName() + " has postponed the midterm");
        this.party(pe);
    }

}
