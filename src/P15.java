public class P15 {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntGUI("Introduceti numarul: ");
        int p = SkeletonJava.readIntGUI("Introduceti puterea: ");
        int rezultat = 1;

        for (int i = 1; i <= p; i++)
            rezultat *= n;

        SkeletonJava.printGUI("Numarul " + n + " ridicat la puterea " + p + " este " + rezultat);
    }
}
