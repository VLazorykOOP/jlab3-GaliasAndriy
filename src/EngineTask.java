//Побудувати ієрархію класів відповідно до варіанта завдання.
//        Згідно завдання вибрати суперклас (базовий клас) та підкласи (похідні класи). В
//        класах задати поля, які характерні для кожного класу. Для всіх класів
//        розробити метод Show(), який виводить дані про об’єкт класу. Розробити
//        програму, яка вводить інформацію про об’єкти заданих сутностей згідно
//        варіанту в масив типу суперкласу та друкує введений масив (з використанням
//        методу Show()).

// 12.Двигун, двигун внутрішнього згоряння, дизель, реактивний двигун.
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

        BaseEngine[] engine = new BaseEngine[n];
        
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
                    engine[i] = new InternalCombustionEngine();
                    System.out.println(" Enter data about a [" + i+1 + "] engine");
                    engine[i].input();
                    break;
                case 2: 
                    engine[i] = new DieselEngine();
                    System.out.println(" Enter data about a [" + i+1 + "] engine");
                    engine[i].input();
                    break;   
                case 3: 
                    engine[i] = new ReactiveEngine();
                    System.out.println(" Enter data about a [" + i+1 + "] engine");
                    engine[i].input();
                    break; 
            }
        }

        System.out.println("\n\n All data: \n------------------------------");
        for (int i = 0; i < n; i++){
            System.out.println(" Data about a [" + i+1 + "] engine");
            engine[i].show();
        }

        // engines[0] = new InternalCombustionEngine("Gasoline", "gas", 4, 75, 265, 1.3);
        // engines[1] = new DieselEngine("EcoDiesel", "diesel", 6, 260, 1600, 3.0, "Turbocharged", 6);
        // engines[2] = new ReactiveEngine("General Electric GE90 series", "8.4 - 9", "360 to 510 kN");
        // for (BaseEngine eng : engine) {
        //     System.out.println("\n\n Engine " + engine + 1);
        //     eng.show();
        //     System.out.println("");
        // }
    }
}
