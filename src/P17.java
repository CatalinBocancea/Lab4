public class P17 {

    public static void main(String[] args) {

        int[] array = {2, 3, 6, 8, 3, 1, 9, 8};

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1])
                System.out.println(array[i] + " " + array[i + 1]);
            }
        }
}