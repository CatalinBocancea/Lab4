// Sa se calculeze media aritmetica pana cand numarul introdus este 0

public class P3 {

    public static void main(String[] args) {

       double nr;
       double sum = 0;
       double numere = -1;

       do {
           nr = SkeletonJava.readDoubleGUI("Introduceti numarul: ");
           sum += nr;
           numere++;
       } while (nr != 0);

       double avg = sum / numere;

       SkeletonJava.printGUI("Media aritmetica a celor " + numere + " numere este " + avg);
    }
}
