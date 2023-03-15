import java.util.Scanner;

public class ReactiveEngine extends BaseEngine{
    private String bypassRatio;
    private String thrust;

    public ReactiveEngine() {
        super();
        bypassRatio = "no data";
        thrust = "no data";
    }

    public ReactiveEngine(String type, String bypassRatio, String thrust) {
        super(type);
        this.bypassRatio = bypassRatio;
        this.thrust = thrust;
    }

    public String getBypassRation() {
        return bypassRatio;
    }
    public String getThrust() {
        return thrust;
    }

    public String show() {
        super.show();
        String res = "\n Bypass ratio: " + bypassRatio + "\n Thrust: " + thrust;
        return res;
    }

    Scanner in = new Scanner(System.in);
    public void input() {
        System.out.println("\n Fill next data about a reactive/jet engine:");
        System.out.print("  Enter bypass ratio: ");
        bypassRatio = in.nextLine();
        System.out.print("  Enter thrust: ");
        thrust = in.nextLine();
    }
}