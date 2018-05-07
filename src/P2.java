public class P2 {

    public static void main(String args[]) {

        double sum = 0;
        int lungime = SkeletonJava.readIntGUI("Cate numere contine sirul?");
        int[] numere = new int[lungime];

        for (int i = 0; i < numere.length; i++) {
            numere[i] = SkeletonJava.readIntGUI("Introduceti numarul: ");
            sum += numere[i];
        }

        double avg = sum / numere.length;

        SkeletonJava.printGUI("Media aritmetica a celor " + numere.length + " numere este " + avg);
    }
}