public class P5 {

    public static void main(String[] args) {

        double min = SkeletonJava.readDoubleGUI("Introduceti valoarea minima: ");
        double max = SkeletonJava.readDoubleGUI("Introduceti valoarea maxima: ");

        for (double F = min; F <= max; F++) {
            double C = 5.0 / 9 * (F - 32);
            SkeletonJava.printConsole(F + "gF = " + C + "gC");
        }
    }
}
