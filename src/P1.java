public class P1 {

    public static void main(String[] args) {

        double primulNr = SkeletonJava.readDoubleGUI("Introduceti primul numar: ");
        double alDoileaNr = SkeletonJava.readDoubleGUI("Introduceti al doilea numar: ");

        double rezultat = (primulNr + alDoileaNr) / 2;

        SkeletonJava.printGUI("Media aritmetica a celor doua numere este "+rezultat);
    }
}
