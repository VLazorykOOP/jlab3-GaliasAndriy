import java.util.Scanner;

public class DieselEngine extends InternalCombustionEngine{
    private String specificFuelConsumption;
    private int numberOfInjectors;
    private Scanner in = new Scanner(System.in);

    public DieselEngine() {
        super();
        specificFuelConsumption = "no info";
    }

    public DieselEngine(String type, String fuelType, int cylinderCount, double hp,
    double torque, double volumeEngine, String specificFuelConsumption, int numberOfInjectors) {
        super(type, fuelType, cylinderCount, hp, torque, volumeEngine);
        this.specificFuelConsumption = specificFuelConsumption;
        this.numberOfInjectors = numberOfInjectors;
    }

    public String getSpecificFuelConsumption() {
        return specificFuelConsumption;
    }
    public int getNumberOfInjectors() {
        return numberOfInjectors;
    }

    public String show() {
        String res = super.show() + "\n Specific fuel consumtion: " + specificFuelConsumption +
        "\n Number of injectors: " + numberOfInjectors;
        return res;
    }

    public void input() {
        super.inputDieselEngine();
        System.out.println("\n Fill next data about an diesel engine:");
        System.out.print(" Enter specific fuel consumption: ");
        specificFuelConsumption = in.nextLine();
        do {
            System.out.print(" Enter number of injectors (1 <= n <= 32): ");
            numberOfInjectors = in.nextInt();
        } while(numberOfInjectors <= 1 && numberOfInjectors >= 32);        
    }
}
