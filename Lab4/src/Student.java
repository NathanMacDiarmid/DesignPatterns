import java.util.ArrayList;

public class Student extends Course {
    private int id;
    private int year;
    private ArrayList<Student> students;

    public Student(String name) {
        super(name);
        this.students = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void getStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("        <student id=\"" + students.get(i).getId() + "\" year=\""
                    + students.get(i).getYear() + "\">" + students.get(i).getName() + "</student>");
        }
    }

    public void addStudents(Student student) {
        students.add(student);
    }
}
