
public class P9 {

    public static void main(String[] args) {

        double D = SkeletonJava.readDoubleGUI("Introduceti distanta dintre cele doua orase, in km: ");
        double d = D * 1000;

        double vIon = SkeletonJava.readDoubleGUI("Care este viteza lui Ion? (km/h)");
        double vI = vIon * 1000 / 3600;

        double vFlorica = SkeletonJava.readDoubleGUI("Care este viteza Floricai? (km/h)");
        double vF = vFlorica * 1000 / 3600;

        int sec = 1;
        double dIon = vI;
        double dFlorica = vF;

        while (dIon < (d - dFlorica)) {
            sec++;
            dIon += vI;
            dFlorica += vF;
        }

        SkeletonJava.printGUI("Cei doi se vor intalni dupa " + sec / 60.0 + " minute, la o distanta de " + dIon / 1000 + " km fata de primul oras.");
    }
}
