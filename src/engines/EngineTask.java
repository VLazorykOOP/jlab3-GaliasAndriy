import java.util.Scanner;

public class EngineTask {
    public static void main(String[] args) {
        System.out.println(" Lab 3");
        System.out.println(" Task 1");
        int n = 0;

        Scanner in = new Scanner(System.in);
        do {
			System.out.print("Quantity of engines (n < 10): ");
			n = in.nextInt();
		} while (n <= 0 || n > 10);

        BaseEngine[] engines = new BaseEngine[n];

        int type = 1;
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Choose a type of engine: ");
                System.out.println(" 1 - Internal combustion engine ");
                System.out.println(" 2 - Diesel engine ");
                System.out.println(" 3 - Reactive engine ");
                type = in.nextInt();
            } while (type < 1 || type > 3);

            switch(type) {
                case 1:
                    engines[i] = new InternalCombustionEngine();
                    System.out.println(" Enter data about a [" + (i+1) + "] engine");
                    in.nextLine();
                    String title;
                    do {
                        System.out.print(" Enter title of engine: ");
                        title = in.nextLine();
                    } while(title == "" || title.length() < 3);
                    engines[i].setTitle(title);
                    System.out.println("\n Fill next data about an internal combustion engine:");

                    if (engines[i] instanceof InternalCombustionEngine) {        
                        boolean isValid = false;
                        do {
                            System.out.println("  Enter fuel type from given list");
                            System.out.println("  Petrol/gasoline | diesel | CNG/Compressed natural gas | biodiesel | LPG | ethanol | methanol | electricity");
                            String fuelType = in.nextLine().toLowerCase();
                
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
                                    ((InternalCombustionEngine) engines[i]).setFuelType(fuelType);
                                    break;
                                default:
                                    System.out.println(" Invalid fuel type entered.");
                            }
                        } while (!isValid);
                        
                        int cylinderCount;
                        do {
                            System.out.print(" Enter quantiny of cylinders (2 <= n <= 32): ");
                            cylinderCount = in.nextInt();
                            ((InternalCombustionEngine) engines[i]).setCylinderCount(cylinderCount);
                        } while(cylinderCount <= 2 || cylinderCount >= 32);

                        double hp;
                        do {
                            System.out.print(" Enter horse powers (7 <= n <= 5100): ");
                            hp = in.nextDouble();
                            ((InternalCombustionEngine) engines[i]).setHP(hp);
                        } while(hp <= 7 || hp >= 5100);

                        double torque;
                        do {
                            System.out.print(" Enter torque (90 <= n <= 10000): ");
                            torque = in.nextDouble();
                            ((InternalCombustionEngine) engines[i]).setTorque(torque);
                        } while(torque <= 90 || torque >= 5100);

                        double volumeEngine;
                        do {
                            System.out.print(" Enter volume engine (0.5 <= n <= 10.0): ");
                            volumeEngine = in.nextDouble();
                            ((InternalCombustionEngine) engines[i]).setVolumeEngine(volumeEngine);
                        } while(volumeEngine <= 0.5 || volumeEngine >= 10.0);
                    }
                break;
                case 2:
                    engines[i] = new DieselEngine();
                    System.out.println(" Enter data about a [" + (i+1) + "] engine");
                    in.nextLine();
                    String titleDiesel;
                    do {
                        System.out.print(" Enter title of engine: ");
                        titleDiesel = in.nextLine();
                    } while(titleDiesel == "" || titleDiesel.length() < 3);
                    engines[i].setTitle(titleDiesel);

                    if (engines[i] instanceof DieselEngine) {
                        String fuelType = "diesel";
                        ((DieselEngine) engines[i]).setFuelType(fuelType);
                        
                        int cylinderCount;
                        do {
                            System.out.print(" Enter quantity of cylinders (2 <= n <= 32): ");
                            cylinderCount = in.nextInt();
                            ((InternalCombustionEngine) engines[i]).setCylinderCount(cylinderCount);
                        } while(cylinderCount <= 2 || cylinderCount >= 32);

                        double hp;
                        do {
                            System.out.print(" Enter horse powers (7 <= n <= 5100): ");
                            hp = in.nextDouble();
                            ((InternalCombustionEngine) engines[i]).setHP(hp);
                        } while(hp <= 7 || hp >= 5100);

                        double torque;
                        do {
                            System.out.print(" Enter torque (90 <= n <= 10000): ");
                            torque = in.nextDouble();
                            ((InternalCombustionEngine) engines[i]).setTorque(torque);
                        } while(torque <= 90 || torque >= 5100);

                        double volumeEngine;
                        do {
                            System.out.print(" Enter volume engine (0.5 <= n <= 10.0): ");
                            volumeEngine = in.nextDouble();
                        } while(volumeEngine <= 0.5 || volumeEngine >= 10.0);
                        ((InternalCombustionEngine) engines[i]).setVolumeEngine(volumeEngine);

                        System.out.println("\n Fill additional data about a diesel engine:");

                        int numberOfInjectors;
                        do {
                            System.out.print(" Enter number of injectors (1 <= n <= 32): ");
                            numberOfInjectors = in.nextInt();
                            ((DieselEngine) engines[i]).setNumberOfInjectors(numberOfInjectors);
                        } while(numberOfInjectors <= 1 || numberOfInjectors >= 32);
                    } 
                break;
                case 3:
                    engines[i] = new ReactiveEngine();
                    System.out.println(" Enter data about a [" + (i+1) + "] engine");
                    in.nextLine();
                    String titleJetEngine;
                    do {
                        System.out.print(" Enter title of engine: ");
                        titleJetEngine = in.nextLine();
                    } while(titleJetEngine == "" || titleJetEngine.length() < 3);
                    engines[i].setTitle(titleJetEngine);

                    if (engines[i] instanceof ReactiveEngine) {
                        System.out.println("\n Fill next data about a reactive/jet engine:");
                        System.out.print("  Enter bypass ratio: ");
                        String bypassRatio = in.nextLine();
                        ((ReactiveEngine) engines[i]).setBypassRatio(bypassRatio);
                        System.out.print("  Enter thrust: ");
                        String thrust = in.nextLine(); 
                        ((ReactiveEngine) engines[i]).setThrust(thrust);
                    }
                break;
            }
        }

        System.out.println("\n All data: \n------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("\nData about a [" + (i+1) + "] engine");
            System.out.println(engines[i].show());
        }
        System.out.println();
        in.close();
    }
}
