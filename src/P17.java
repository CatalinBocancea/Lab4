public class P17 {

    public static void main(String[] args) {

        int[] array = {2, 3, 6, 8, 3, 1, 9, 8};
        int j = 1;

        for (int i = 0; i < (array.length - 1); i++) {
            if ((array[i] > array[j]) && (j < array.length))
                System.out.println(array[i] + " " + array[j]);
            j++;
            }
        }
}
