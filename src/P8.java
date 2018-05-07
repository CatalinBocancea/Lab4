public class P8 {

    public static void main(String[] args) {

        double D = SkeletonJava.readDoubleGUI("Introduceti distanta parcursa in km: ");
        double H = SkeletonJava.readDoubleGUI("Introduceti durata calatoriei in ore: ");

        double speed = (D * 1000.00) / (H * 3600.00);

        SkeletonJava.printGUI("Testoasa noastra a avut o viteza de " + speed + " m/s");
    }
}
