package ru.skypro.oop.part_1;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public Gryffindor(String name, int magicPower, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, magicPower, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    private int ability() {
        return nobility + honor + bravery;
    }

    public void compareStudent(Gryffindor student) {
        if (this.ability() > student.ability()) {
            System.out.println(this.getStudentName() + " is better student, than " + student.getStudentName());
        } else if (this.ability() < student.ability()){
            System.out.println(student.getStudentName() + " is better student, than " + this.getStudentName());
        } else {
            System.out.println("Student " + this.getStudentName() + " and student " + student.getStudentName() + " are equal.");
        }
    }
}
