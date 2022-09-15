package ru.skypro.oop.part_1;

public class Ravenclaw extends Hogwarts {
    private int smartness;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int distanceOfTransgression, int smartness, int wisdom, int wittiness, int creativity) {
        super(name, magicPower, distanceOfTransgression);
        this.smartness = smartness;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getSmartness() {
        return smartness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " Ravenclaw{" +
                "smartness=" + smartness +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creativity=" + creativity +
                '}';
    }

    private int ability() {
        return smartness + wisdom + wittiness + creativity;
    }

    public void compareStudent(Ravenclaw student) {
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
