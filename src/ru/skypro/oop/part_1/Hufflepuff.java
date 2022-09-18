package ru.skypro.oop.part_1;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int distanceOfTransgression, int hardworking, int loyalty, int honesty) {
        super(name, magicPower, distanceOfTransgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    private int ability() {
        return hardworking + loyalty + honesty;
    }

    public void compareStudent(Hufflepuff student) {
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
