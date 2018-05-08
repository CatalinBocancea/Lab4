// Se da un numar. Sa se afiseze "true" daca numarul apartine intervalului [9, 24]. Altfel sa se afiseze "false"

public class P14 {

    public static void main(String[] args) {

        double n = SkeletonJava.readDoubleGUI("Introduceti numarul: ");
        boolean check;

        check = (9 <= n) && (n <= 24);

        System.out.println(check);
    }
}
