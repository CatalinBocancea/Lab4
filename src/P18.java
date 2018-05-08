// Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
// suma = 1 + (x la puterea 1) + (x la puterea 2) + ... + (x la puterea n)

public class P18 {

    public static void main(String[] args) {

        int x = SkeletonJava.readIntGUI("Introduceti numarul: ");
        int n = SkeletonJava.readIntGUI("Introduceti puterea: ");
        int sum = 1;
        int putere = 1;

        for (int f = 1; f <= n; f++) {
            putere *= n;
            sum += putere;
        }

        SkeletonJava.printGUI("Suma este: " + sum);
    }
}