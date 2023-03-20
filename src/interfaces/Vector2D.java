package interfaces;

public class Vector2D implements Norm {
    private double x;
    private double y;

    public Vector2D() {
        x = 0; y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateNorm() { 
        return Math.sqrt(x*x + y*y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Vector2D)) {
            return false;
        }
        Vector2D anotherObj = (Vector2D) obj;
        return Double.compare(x, anotherObj.x) == 0 && Double.compare(y, anotherObj.y) == 0;
    }
}