package ru.skypro.oop.part_1;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindor harry = generateGryffindorStudent("Harry Potter");
        Gryffindor hermione = generateGryffindorStudent("Hermione Granger");
        Gryffindor ron = generateGryffindorStudent("Ron Weasley");

        Slytherin draco = generateSlytherinStudent("Draco Malfoy");
        Slytherin graham = generateSlytherinStudent("Graham Montague");
        Slytherin gregory = generateSlytherinStudent("Gregory Goyle");

        Hufflepuff zach = generateHufflepuffStudent("Zachariah Smith");
        Hufflepuff cedric = generateHufflepuffStudent("Cedric Diggory");
        Hufflepuff justin = generateHufflepuffStudent("Justin Finch-Fletchley");

        Ravenclaw zhou = generateRavenclawStudent("Zhou Chang");
        Ravenclaw padma = generateRavenclawStudent("Padma Patil");
        Ravenclaw marcus = generateRavenclawStudent("Marcus Belby");

        harry.printStudent();
        draco.printStudent();
        gregory.printStudent();
        harry.compareStudent(draco);

        draco.compareStudent(gregory);

    }

    public static Gryffindor generateGryffindorStudent(String name) {
        return new Gryffindor(
            name,
            RANDOM.nextInt(100),
            RANDOM.nextInt(100),
            RANDOM.nextInt(100),
            RANDOM.nextInt(100),
            RANDOM.nextInt(100)
        );
    }

    public static Hufflepuff generateHufflepuffStudent(String name) {
        return new Hufflepuff(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    public static Ravenclaw generateRavenclawStudent(String name) {
        return new Ravenclaw(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    public static Slytherin generateSlytherinStudent(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}
