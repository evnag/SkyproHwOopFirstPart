package ru.skypro.oop.part_1;

public abstract class Hogwarts {
    private String studentName;
    private int magicPower;
    private int distanceOfTransgression;

    public Hogwarts(String studentName, int magicPower, int distanceOfTransgression) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + studentName + '\'' +
                ", magicPower=" + magicPower +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    public void printStudent() {
        System.out.println(this);
    }

    private int ability() {
        return magicPower + distanceOfTransgression;
    }

    public void compareStudent(Hogwarts student) {
        System.out.println(ability() + " " + student.ability());
        if (this.ability() > student.ability()) {
            System.out.println(this.getStudentName() + " is better student, than " + student.getStudentName());
        } else if (this.ability() < student.ability()){
            System.out.println(student.getStudentName() + " is better student, than " + this.getStudentName());
        } else {
            System.out.println("Student " + this.getStudentName() + " and student " + student.getStudentName() + " are equal.");
        }
    }
}
