public class Course {

    private String name;

    public Course(String code) {
        this.name = code;
    }

    public String getName() {
        return name;
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

        s1.addStudents(s1);
        s1.addStudents(s2);

        System.out.println("<course>");
        System.out.println("    <code>" + course.getName() + "</code>");
        System.out.println("    <prof>" + prof.getName() + "</prof>");
        System.out.println("    <class>");
        s1.getStudents();
        System.out.println("    </class>");
        System.out.println("</course>");


    }
}


