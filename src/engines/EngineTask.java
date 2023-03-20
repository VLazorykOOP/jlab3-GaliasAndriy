import java.util.Scanner;

public class EngineTask {
    public static void main(String[] args) {
        System.out.println(" Lab 3");
        System.out.println(" Task 1");
        int n = 0;
        int i = 0;

        Scanner in = new Scanner(System.in);
        do {
			System.out.print("Quantity of engines (n < 10): ");
			n = in.nextInt();
		} while (n <= 0 || n > 10);

        BaseEngine[] engines = new BaseEngine[n];

        int type = 1;
        for (i = 0; i < n; i++) {
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
                    engines[i].input();
                    break;
                case 2:
                    engines[i] = new DieselEngine();
                    System.out.println(" Enter data about a [" + (i+1) + "] engine");
                    engines[i].input();
                    break;
                case 3:
                    engines[i] = new ReactiveEngine();
                    System.out.println(" Enter data about a [" + (i+1) + "] engine");
                    engines[i].input();
                    break;
            }
        }

        System.out.println("\n All data: \n------------------------------");
        for (i = 0; i < n; i++) {
            System.out.println("Data about a [" + (i+1) + "] engine");
            System.out.println(engines[i].show());
        }
        engines[0].getType();
    }
}
