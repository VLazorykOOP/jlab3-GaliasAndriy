import java.util.Scanner;

public class BaseEngine {
    private String title;
    //private Scanner in = new Scanner(System.in);

    public BaseEngine() {
        title = "no type";
    }
    public BaseEngine(String t) {
        title = t;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String type){
        this.title = type;
    }

    public String show() {
        return "\n Title: " + title;
    }
}