// Se da un sir de numere. Sa se afiseze: numarul maxim, numarul minim, suma lor, sirul dublat

import java.util.Arrays;

public class P6 {

    public static void main(String[] args) {

        int lungime = SkeletonJava.readIntGUI("Cate elemente doriti sa aiba sirul?");
        int[] array = new int[lungime];
        int min = 0;
        int max = 0;
        int sum = 0;
        int[] x2 = new int [array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++){
            int n = (int)(Math.random()*9 + 1);
            array[i] = n;
            min = array[0];
            if (min > array[i])
                min = array[i];
            else
                if (max < array[i])
                    max = array[i];
            sum += array[i];
            x2[j] = array[i] * 2;
            j++;
        }

        SkeletonJava.printGUI("Pentru sirul " + Arrays.toString(array) + " rezultatele sunt urmatoarele:\n" + "Minim = " + min + "\nMaxim = " + max + "\nSuma = " + sum + "\nSirul dublat = " + Arrays.toString(x2));
    }
}
