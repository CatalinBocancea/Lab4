import java.util.Arrays;

public class P21 {

    public static void main(String[] args) {

        int min = SkeletonJava.readIntGUI("Introduceti valoarea minima: ");
        int max = SkeletonJava.readIntGUI("Introduceti valoarea maxima: ");

        int[] array = new int[10];
        int[] interval = new int[array.length];
        int j = 0;

        for (int i=0; i < array.length; i++) {
            int n = (int)(Math.random()*90 + 1);
            array[i] = n;
            if (array[i] >= min && array[i] <= max) {
                interval[j] = array[i];
                j++;
            }
        }

        System.out.println("Sirul generat este: " + Arrays.toString(array));
        System.out.println("Sirul cu elemente cuprinse intre " + min + " si " + max + " este: " + Arrays.toString(interval));
    }
}
