package ru.skypro.oop.part_2;

public class ServiceStation implements CheckService {
    @Override
    public void check(Car car) {
        if (car != null) {
            printCheckedModel(car);
            updateTyre(car);
            car.checkEngine();
        }
    }

    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            printCheckedModel(bicycle);
            updateTyre(bicycle);
        }
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            printCheckedModel(truck);
            updateTyre(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    private void printCheckedModel(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
    }

    private void updateTyre(Vehicle vehicle) {
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}
