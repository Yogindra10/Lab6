import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        double side1 = 0;
        double side2 = 0;
        boolean side1Check = false;
        boolean side2Check = false;

        //inputs
        do {
            System.out.println("Enter your first side length");

            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();

                if (side1 <= 0) {
                    System.out.println("Error, Please try again");
                } else {
                    side1Check = true;
                }
            } else {
                System.out.println("Error, Please try again");
                scan.nextLine();
            }

        }while (!side1Check);

        do {
            System.out.println("Enter your second side length");

            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();

                if (side2 <= 0) {
                    System.out.println("Error, Please try again");
                } else {
                    side2Check = true;
                }
            } else {
                System.out.println("Error, Please try again");
                scan.nextLine();
            }

        }while (!side2Check);

        //calculations
        double area = .5 * (side1 * side2);
        double hypo = Math.hypot(side1, side2);
        double perimeter = hypo + side1 + side2;

        //Outputs
        System.out.printf("\n%-23s %7.2f m^2", "Area:" , area);
        System.out.printf("\n%-23s %7.2f m", "Hypotenuse:" , hypo);
        System.out.printf("\n%-23s %7.2f m", "Perimeter:" , perimeter);
    }
}
