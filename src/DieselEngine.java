import java.util.Scanner;

public class DieselEngine extends InternalCombustionEngine{
    private String specificFuelConsumption;
    private int numberOfInjectors;

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
        super.show();
        String res = "\n Specific fuel consumtion: " + specificFuelConsumption + 
        "\n Number of injectors: " + numberOfInjectors;
        return res;
    }

    Scanner in = new Scanner(System.in);
    public void input() {
        System.out.println("\n Fill next data about an diesel engine:");
        System.out.print(" Enter specific fuel consumption: ");
        specificFuelConsumption = in.nextLine();
        do {
            System.out.print(" Enter number of injectors (1 <= n <= 32): ");
            numberOfInjectors = in.nextInt();
        } while(numberOfInjectors <= 1 && numberOfInjectors >= 32);        
    }
}
