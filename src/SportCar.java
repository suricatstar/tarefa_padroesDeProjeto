public class SportCar implements Car {
    private int maxSpeed = 300;
    private String engineType = "V8 Turbo";

    @Override
    public void assemble() {
        System.out.println("Montando carro esportivo");
    }

    @Override
    public void displaySpecs() {
        System.out.println("=== CARRO ESPORTIVO ===");
        System.out.println("Velocidade máxima: " + maxSpeed + " km/h");
        System.out.println("Motor: " + engineType);
        System.out.println("Tipo: Performance");
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }
}
