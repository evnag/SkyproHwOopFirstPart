package ru.skypro.oop.part_1;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int lustOfPower;

    public Slytherin(String name, int magicPower, int distanceOfTransgression, int cunning, int decisiveness, int ambition, int lustOfPower) {
        super(name, magicPower, distanceOfTransgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Slytherin{" +
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambition=" + ambition +
                ", lustOfPower=" + lustOfPower +
                '}';
    }

    private int ability() {
        return cunning + decisiveness + ambition + lustOfPower;
    }

    public void compareStudent(Slytherin student) {
        System.out.println(this.ability() + " " + student.ability());
        if (this.ability() > student.ability()) {
            System.out.println(this.getStudentName() + " is better student, than " + student.getStudentName());
        } else if (this.ability() < student.ability()){
            System.out.println(student.getStudentName() + " is better student, than " + this.getStudentName());
        } else {
            System.out.println("Student " + this.getStudentName() + " and student " + student.getStudentName() + " are equal.");
        }
    }
}
