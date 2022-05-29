package with_ide;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        System.out.print(" enter a Word:\n");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        scanner.close();

        switch (input) {
            case "Cat":
                System.out.println("Cute animal");
                break;
            case "Car":
                System.out.println("Ferri?");
                break;
            case "Dog":
                System.out.println("I hate that");
                break;
            case "bicycle":
                System.out.println("love it");
                break;
            default:
                System.out.println("We don't have information");
        }
    }

}

