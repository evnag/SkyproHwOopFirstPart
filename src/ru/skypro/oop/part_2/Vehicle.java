package ru.skypro.oop.part_2;

public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void printUpdateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void updateTyre(Vehicle vehicle) {
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.printUpdateTyre();
        }
    }

    public void printCheckedModel(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
    }
}
