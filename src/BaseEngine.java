public class BaseEngine {
    private String brand;
    private double hp;
    private String volumeEngine;

    public BaseEngine() {
        brand = "no brand";
        hp = 0;
        volumeEngine = "no info";
    }
    public BaseEngine(String br, double HP, String vol) {
        brand = br;
        hp = HP;
        volumeEngine = vol;
    }
    public String getBrand() {
        return brand;
    }
    public double getHP() {
        return hp;
    }
    public String getVolumeEngine() {
        return volumeEngine;
    }
    public String toString() {
        String res;
        res = " Brand: " + brand + "\n hp: " + hp + "\n Engine volume: " + volumeEngine;
        return res;
    }

}