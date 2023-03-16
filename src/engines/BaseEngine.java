import java.util.Scanner;

public class BaseEngine {
    private String type;
    private Scanner in = new Scanner(System.in);

    public BaseEngine() {
        type = "no type";
    }
    public BaseEngine(String t) {
        type = t;
    }
    public String getType() {
        return type;
    }

    public String show() {
        String res;
        res = " Base info: " + "\n Type: " + type;
        return res;
    }

    public void input() {
        System.out.print(" Enter type or name of engine: ");
        type = in.nextLine();
    }
}