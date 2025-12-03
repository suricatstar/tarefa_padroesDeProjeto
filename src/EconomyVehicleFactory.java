public class EconomyVehicleFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new EconomyCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new EconomyMotorcycle();
    }
}
