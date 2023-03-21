import java.util.Scanner;

public class DieselEngine extends InternalCombustionEngine{
    private int numberOfInjectors;
    private Scanner in = new Scanner(System.in);

    public DieselEngine() {
        super();
        numberOfInjectors = 0;
    }

    public DieselEngine(String type, String fuelType, int cylinderCount, double hp,
    double torque, double volumeEngine, int numberOfInjectors) {
        super(type, fuelType, cylinderCount, hp, torque, volumeEngine);
        this.numberOfInjectors = numberOfInjectors;
    }

    public int getNumberOfInjectors() {
        return numberOfInjectors;
    }
    public void setNumberOfInjectors(int numberOfInjectors) {
        this.numberOfInjectors = numberOfInjectors;
    }

    public String show() {
        String res = super.show() + "\n Number of injectors: " + numberOfInjectors;
        return res;
    } 

    // public void input() {
    //     super.inputDieselEngine();
    //     System.out.println("\n Fill additional data about a diesel engine:");
    //     System.out.print(" Enter specific fuel consumption: ");
    //     specificFuelConsumption = in.nextLine();
    //     do {
    //         System.out.print(" Enter number of injectors (1 <= n <= 32): ");
    //         numberOfInjectors = in.nextInt();
    //     } while(numberOfInjectors <= 1 && numberOfInjectors >= 32);        
    // }
}
