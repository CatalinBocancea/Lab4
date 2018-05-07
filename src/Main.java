public class Main {

    public static void main(String[] args) {

        SkeletonJava.printGUI("This is my Homework.");

        String answer = SkeletonJava.readStringGUI("Are you ready? yes or no?");

        if (answer.equalsIgnoreCase("y")) {
            answer = SkeletonJava.readStringGUI("Are you sure? yes or no?");
            answer = SkeletonJava.readStringGUI("Really, really sure? yes or no?");
            answer = SkeletonJava.readStringGUI("Last chance to ABORT! yes or no?");
            SkeletonJava.printGUI("You are very determined!");
            answer = SkeletonJava.readStringGUI ("Are you? yes or no?");
            SkeletonJava.printGUI("Let's GO!");
        }

    }
}
