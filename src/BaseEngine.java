import java.util.Scanner;

public class BaseEngine {
    private String type;

    public BaseEngine() {
        type = "no type";
    }
    public BaseEngine(String t) {
        type = t;
    }
    public String getBrand() {
        return type;
    }

    public String show() {
        String res;
        res = "\n Base info: " + "\n Type: " + type;
        return res;
    }
    
    Scanner in = new Scanner(System.in);
    public void input() {
        System.out.print(" Enter type or name of engine: ");
        type = in.nextLine();
        System.out.println("");
    }
}