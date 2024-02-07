package entities;

public class Student {
    private String name;
    private double first_semester;
    private double second_semester;

    public Student(String name, double first_semester, double second_semester) {
        this.name = name;
        this.first_semester = first_semester;
        this.second_semester = second_semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirst_semester() {
        return first_semester;
    }

    public void setFirst_semester(double first_semester) {
        this.first_semester = first_semester;
    }

    public double getSecond_semester() {
        return second_semester;
    }

    public void setSecond_semester(double second_semester) {
        this.second_semester = second_semester;
    }
}
