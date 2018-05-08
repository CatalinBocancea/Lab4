import java.rmi.server.Skeleton;

public class P18 {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntGUI("Introduceti numarul: ");
        int p = SkeletonJava.readIntGUI("Introduceti puterea: ");
        int sum = 1;
        int putere = 1;

        for (int f = 1; f <= p; f++) {
            putere *= n;
            sum += putere;
        }

        SkeletonJava.printGUI("Suma este: " + sum);
    }
}