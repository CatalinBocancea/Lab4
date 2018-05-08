public class P13 {

    public static void main(String[] args) {

        int sum = 0;
        int n;

        do {
            n = SkeletonJava.readIntGUI("Introduceti numarul: ");
            if (n > 4 && n < 11)
                sum += n;
        } while (n != 0);

        SkeletonJava.printGUI("Suma numerelor introduse este: " + sum);
    }
}
