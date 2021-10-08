public class Student extends Course {
    private int id;
    private int year;
    public Student(String name) {
        super(name);
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
}
