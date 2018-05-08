// Sa se calculeze suma primelor N numere naturale

public class P12 {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntGUI("Introduceti numarul: ");
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += i;

        SkeletonJava.printGUI("Suma primelor " + n + " numere naturale este: " + sum);
    }
}
