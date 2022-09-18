package ru.skypro.oop.part_2;

public class Bicycle extends Vehicle implements Checkable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkVehicle() {
        printCheckedModel(this);
        updateTyre(this);
    }
}
