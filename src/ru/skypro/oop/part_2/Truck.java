package ru.skypro.oop.part_2;

public class Truck extends Car implements Checkable{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void checkVehicle() {
        if (this != null) {
            printCheckedModel(this);
            updateTyre(this);
            this.checkEngine();
            this.checkTrailer();
        }
    }
}
