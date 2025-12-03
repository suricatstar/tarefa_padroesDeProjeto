public class App {
    public static void main(String[] args) throws Exception {
        // Criando veículos esportivos
        VehicleFactory sportFactory = new SportVehicleFactory();
        Car sportCar = sportFactory.createCar();
        Motorcycle sportMoto = sportFactory.createMotorcycle();

        sportCar.assemble();
        sportMoto.assemble();

        System.out.println("---");

        // Criando veículos econômicos
        VehicleFactory economyFactory = new EconomyVehicleFactory();
        Car economyCar = economyFactory.createCar();
        Motorcycle economyMoto = economyFactory.createMotorcycle();

        economyCar.assemble();
        economyMoto.assemble();
    }
}
