import java.util.Scanner;

public class InternalCombustionEngine extends BaseEngine{
    private String fuelType;
    private int cylinderCount;
    private double hp;
    private double torque;
    private double volumeEngine;
    private Scanner in = new Scanner(System.in);

    public InternalCombustionEngine() {
        super();
        fuelType = "no info";
        cylinderCount = 0;
        hp = 0;
        torque = 0;
    }

    public InternalCombustionEngine(String type, String ft,
    int cc, double HP, double tor, double ve) {
        super(type);
        fuelType = ft;
        cylinderCount = cc;
        hp = HP;
        torque = tor;
        volumeEngine = ve;
    }

    public String getFuelType() {
        return fuelType;
    }
    public int getCylinderCount() {
        return cylinderCount;
    }
    public double getHP() {
        return hp;
    }
    public double getTorque() {
        return torque;
    }
    public double getVolumeEngine() {
        return volumeEngine;
    }

    public String show() {
        String res = super.show() + "\n Fuel type: " + fuelType + "\n Cylinder count: " + cylinderCount +
        "\n Horse powers: " + hp + "\n Torque: " + torque + "\n Volume engine: " + volumeEngine;
        return res;
    }

    public void input() {
        super.input();
        System.out.println("\n Fill next data about an internal combustion engine:");
        boolean isValid = false;
        do {
            System.out.println("  Enter fuel type from given list");
            System.out.println("  Petrol/gasoline | diesel | CNG/Compressed | natural gas | biodiesel | LPG | ethanol | methanol | electricity");
            fuelType = in.nextLine().toLowerCase();

            switch (fuelType) {
                case "petrol":
                case "gasoline":
                case "diesel":
                case "cng":
                case "compressed natural gas":
                case "bio-diesel":
                case "biodiesel":
                case "lpg":
                case "liquid petroleum gas":
                case "ethanol":
                case "methanol":
                case "electricity":
                    isValid = true;
                    break;
                default:
                    System.out.println(" Invalid fuel type entered.");
            }
        } while (!isValid);
        do {
            System.out.print(" Enter quantiny of cylinders (2 <= n <= 32): ");
            cylinderCount = in.nextInt();
        } while(cylinderCount <= 2 && cylinderCount >= 32);
        do {
            System.out.print(" Enter horse powers (7 <= n <= 5100): ");
            hp = in.nextDouble();
        } while(hp <= 7 && hp >= 5100);
        do {
            System.out.print(" Enter torque (90 <= n <= 10000): ");
            torque = in.nextDouble();
        } while(torque <= 90 && torque >= 5100);
        do {
            System.out.print(" Enter volume engine (0.5 <= n <= 10.0): ");
            volumeEngine = in.nextDouble();
        } while(hp <= 0.5 && hp >= 10.0);
    }

    public void inputDieselEngine() {
        super.input();
        System.out.println("\n Fill next data about an internal combustion engine:");
        fuelType = "diesel";
        do {
            System.out.print(" Enter quantiny of cylinders (2 <= n <= 32): ");
            cylinderCount = in.nextInt();
        } while(cylinderCount <= 2 && cylinderCount >= 32);
        do {
            System.out.print(" Enter horse powers (7 <= n <= 5100): ");
            hp = in.nextDouble();
        } while(hp <= 7 && hp >= 5100);
        do {
            System.out.print(" Enter torque (90 <= n <= 10000): ");
            torque = in.nextDouble();
        } while(torque <= 90 && torque >= 5100);
        do {
            System.out.print(" Enter volume engine (0.5 <= n <= 10.0): ");
            volumeEngine = in.nextDouble();
        } while(volumeEngine <= 0.5 && volumeEngine >= 10.0);
    }
}