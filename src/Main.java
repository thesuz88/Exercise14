import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        int square = 0;
        int i = 0;
        String choice = "y";

        while (choice.equalsIgnoreCase("y")){

            System.out.println("Enter a number: ");
            userNum = scan.nextInt();

            for (i = 1; i <= userNum ; i++) {

                square = (int) Math.pow(i, 2);

                System.out.print(square + " ");
            }

            choice = scan.nextLine();
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();
        }

        System.out.println("Good bye!");
    }
}
