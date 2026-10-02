import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    static void main(String[] args) {
        //Variables
        int secretNum = (int) (Math.random() * 16) + 20;
        int guess = 0;
        boolean check = false;
        Scanner scan = new Scanner(System.in);

        //inputs
        do {
            System.out.println("Enter random guess between 20 and 35");

            if (scan.hasNextInt()) {
                guess = scan.nextInt();

                if (guess <= 35 && guess >= 20) {
                    check = true;
                } else {
                    System.out.println("Error, Please try again");
                }
            } else {
                System.out.println("Error, Please try again");
            }
            scan.nextLine();
        } while (!check);

        //outputs
        System.out.println("Your guess was " + guess);
        System.out.println("The real number was " + secretNum);
        if (guess == secretNum) {
            System.out.println("That was Correct!");
        }else if (guess < secretNum) {
            System.out.println("Your guess was too low");
        } else {
            System.out.println("Your guess was too high");
        }
    }
}