import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Student> students;

    public Course(String code) {
        this.name = code;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
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

    public static void main(String[] args) {

        Course course = new Course("SYSC3310");

        Prof prof = new Prof("Babak");

        Student s1 = new Student("Nathan");
        Student s2 = new Student("Tao");
        s1.setId(505);
        s1.setYear(3);
        s2.setId(400);
        s2.setYear(2);

        course.addStudents(s1);
        course.addStudents(s2);

        System.out.println("<course>");
        System.out.println("    <code>" + course.getName() + "</code>");
        System.out.println("    <prof>" + prof.getName() + "</prof>");
        System.out.println("    <class>");
        course.getStudents();
        System.out.println("    </class>");
        System.out.println("</course>");


    }
}


