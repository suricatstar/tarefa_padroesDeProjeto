public class SportVehicleFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new SportCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new SportMotorcycle();
    }
}
