public class P7 {

    public static void main(String[] args) {

        double pretIntreg = SkeletonJava.readDoubleGUI("Introduceti pretul produsului:");
        double TVA = pretIntreg - pretIntreg / 1.19;


        SkeletonJava.printGUI("TVA-ul este de: " + TVA);
    }
}
