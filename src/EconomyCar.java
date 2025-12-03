public class EconomyCar implements Car {
     private int maxSpeed = 180;
    private String engineType = "V4 Turbo";

    @Override
    public void assemble() {
        System.out.println("Montando carro econômico");
    }

    @Override
    public void displaySpecs() {
        System.out.println("=== CARRO ECONÔMICO ===");
        System.out.println("Velocidade máxima: " + maxSpeed + " km/h");
        System.out.println("Motor: " + engineType);
        System.out.println("Tipo: Economy");
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
