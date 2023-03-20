package interfaces;

public class Main {
    public static void main(String[] args) {
        Norm[] vectors = new Norm[4];
        vectors[0] = new Vector2D(1, 15);
        vectors[1] = new Vector3D(7, 0, 7);
        vectors[2] = new Vector3D(-10, 10, -7);
        vectors[3] = new Vector3D(7, -7, 22);

        for (int i = 0; i < vectors.length; i++){
            System.out.println(" Vector [" + (i+1) + "]: " + vectors[i].toString());
            System.out.println(" Norm: " + vectors[i].calculateNorm());
            System.out.println();
        }

        System.out.println("vectors[1].equals(vectors[2]): " + vectors[1].equals(vectors[2]));
    }
}
