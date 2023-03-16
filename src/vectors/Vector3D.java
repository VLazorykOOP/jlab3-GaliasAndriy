package vectors;

public class Vector3D extends Norm{
    private double x;
    private double y;
    private double z;

    public Vector3D() {
        x = 0; y = 0; z = 0;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateNorm() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Vector3D)) {
            return false;
        }
        Vector3D anotherObj = (Vector3D) obj;
        return Double.compare(x, anotherObj.x) == 0 && 
            Double.compare(y, anotherObj.y) == 0 && 
            Double.compare(z, anotherObj.z) == 0;
    }
}
