package ru.skypro.oop.part_2;

public class Car extends Vehicle implements Checkable{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkVehicle() {
        if (this != null) {
            printCheckedModel(this);
            updateTyre(this);
            this.checkEngine();
        }
    }
}
