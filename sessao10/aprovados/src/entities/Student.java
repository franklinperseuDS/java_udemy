package entities;

public class Student {

    private String name;
    private double gradeFirst;
    private double gradeSecond;

    public Student(String name, double gradeFirst, double gradeSecond) {
        this.name = name;
        this.gradeFirst = gradeFirst;
        this.gradeSecond = gradeSecond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGradeFirst() {
        return gradeFirst;
    }

    public void setGradeFirst(double gradeFirst) {
        this.gradeFirst = gradeFirst;
    }

    public double getGradeSecond() {
        return gradeSecond;
    }

    public void setGradeSecond(double gradeSecond) {
        this.gradeSecond = gradeSecond;
    }
}
