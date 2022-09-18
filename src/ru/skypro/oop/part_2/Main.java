package ru.skypro.oop.part_2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation serviceStation = new ServiceStation();
        Checkable checkable = new Bicycle("bicycle3", 2);
        Checkable checkable1 = new Car("car3", 4);
        Checkable checkable2 = new Truck("truck3", 6);

        serviceStation.check(checkable);
        serviceStation.check(checkable1);
        serviceStation.check(checkable2);
    }
}
