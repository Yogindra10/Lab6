import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        //variables
        double kilometers = 0;
        double miles = 0;
        boolean kiloCheck = false;

        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            System.out.println("What is your distance in Kilometers?");

            if (scan.hasNextDouble()){
                kilometers = scan.nextDouble();
                if (kilometers < 0 ) {
                    System.out.println("Error, Please enter a valid number");
                } else {
                    kiloCheck = true;
                }

            } else {
                System.out.println("Error, Please enter a valid number");
            }
        } while (!kiloCheck);

        //Outputs
        miles = kilometers * .621371;
        System.out.printf("\n%-4.2f km \n%-4.2f mi", kilometers, miles);;
    }
}
