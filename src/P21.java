import java.util.Arrays;

public class P21 {

    public static void main(String[] args) {

        int lungime = SkeletonJava.readIntGUI("Care e lungimea sirului?");
        int min = SkeletonJava.readIntGUI("Introduceti valoarea minima: ");
        int max = SkeletonJava.readIntGUI("Introduceti valoarea maxima: ");

        int[] array = new int[lungime];
        int[] interval = new int[array.length];
        int j = 0;
        int k = 0;

        for (int i=0; i < array.length; i++) {
            int n = (int)(Math.random()*90 + 1);
            array[i] = n;
            if (array[i] >= min && array[i] <= max) {
                interval[j] = array[i];
                j++;
            }
        }

        for (int i = 0; i < interval.length; i++) {
            if (interval[i] != 0)
                k++;
        }

        String s = Arrays.toString(interval);
        System.out.println("Sirul generat este: " + Arrays.toString(array));
        System.out.println("Sirul cu elemente cuprinse intre " + min + " si " + max + " este: " + s.substring(0, k * 4 - 1) + "]");
    }
}
