// Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru a doua jumatate sa se afiseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare

import java.util.Arrays;

public class P20 {

    public static void main(String[] args) {

        int lungime = SkeletonJava.readIntGUI("Cate elemente sa aiba sirul?");
        int[] array = new int[lungime];
        int[] newArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            int n = (int)(Math.random()*19 + 1);
            array[i] = n;
        }

        SkeletonJava.printConsole("Sirul generat este: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i < (array.length / 2)) {
                newArray[j] = array[i] * 2;
            }
            else if (array[i] % 2 == 1) {
                newArray[j] = array[i] * 3;
            }
            else {
                newArray[j] = array[i];
            }
            j++;
        }

        SkeletonJava.printGUI(Arrays.toString(newArray));
    }
}
