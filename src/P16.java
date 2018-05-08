// Sa se calculeze factorialul unui numar dat

public class P16 {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntGUI("Introduceti numarul: ");
        double fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        SkeletonJava.printGUI(n + " factorial este: " + fact);
    }
}
