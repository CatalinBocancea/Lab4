// Se da un sir de numere. Sa se afiseze perechile de numere pentru care primul numar este mai mare decat al doilea.

import java.util.Arrays;

public class P17 {

    public static void main(String[] args) {

        int lungime = SkeletonJava.readIntGUI("Cate elemente doriti sa aiba sirul?");
        int[] array = new int[lungime];

        for (int i = 0; i < array.length; i++) {
            int n = (int) (Math.random() * 40 + 1);
            array[i] = n;
        }

        SkeletonJava.printConsole("Sirul generat este " + Arrays.toString(array));

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1])
                System.out.println(array[i] + " " + array[i + 1]);
            }
        }
}