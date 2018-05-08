// Se da un sir. Sa se verifice daca sirul este ordonat crescator, iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare

import java.util.Arrays;

public class P19 {

    public static void main(String[] args) {

        int lungime = SkeletonJava.readIntGUI("Cate elemente doriti sa aiba sirul?");
        int[] array = new int[lungime];

        for (int i = 0; i < array.length; i++) {
            int n = (int) (Math.random() * 9 + 1);
            array[i] = n;
        }

        SkeletonJava.printConsole("Sirul generat este: " + Arrays.toString(array));

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] < array[i + 1])
                SkeletonJava.printConsole("Crescator");
            else {
                Arrays.sort(array);
                SkeletonJava.printConsole("Sirul ordonat crescator este: " + Arrays.toString(array));
            }
        }
    }
}