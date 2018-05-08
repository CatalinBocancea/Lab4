// Se da un numar in grade Fahrenheit; sa se converteasca in Celsius

public class P4 {

    public static void main(String[] args) {

        double F = SkeletonJava.readDoubleGUI("Introduceti temperatura in grade Fahrenheit: ");
        double C = 5.0 / 9 * (F - 32);

        SkeletonJava.printGUI("Pentru temperatura de " + F + "gF echivalentul este " + C + "gC");
    }
}
