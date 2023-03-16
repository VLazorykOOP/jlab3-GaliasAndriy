package vectors;

public class VectorMain {
    public static void main(String[] args) {
        Norm[] vectors = new Norm[3];
        vectors[0] = new Vector2D(1, 2);
        vectors[1] = new Vector3D(3, 5, 7);
        vectors[2] = new Vector3D(-10, 10, -7);

        for (int i = 0; i < vectors.length; i++){
            System.out.println(" Vector [" + (i+1) + "]: " + vectors[i].toString());
            System.out.println(" Norm: " + vectors[i].calculateNorm());
            System.out.println();
        }

        System.out.println("vectors[1].equals(vectors[2]): " + vectors[1].equals(vectors[2]));
    }
}
