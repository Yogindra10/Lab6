import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        //variables
        double numCharge = 0;
        double runTime = 0;
        double chargeCost = 0;
        boolean checkNum = false;
        boolean runCheck = false;
        boolean costCheck = false;
        double costPerHour = 0;
        double totalTime = 0;
        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            System.out.println("Enter the number of full battery charges available");
            if(scan.hasNextDouble()) {
                numCharge = scan.nextDouble();
                if (numCharge < 0) {
                    System.out.println("Error, Please try again");
                } else {
                    checkNum = true;
                }
            } else {
                System.out.println("Error");
            }
            scan.nextLine();
        } while(!checkNum);

        do {
            System.out.println("Enter the robot run time in minutes");
            if(scan.hasNextDouble()) {
                runTime = scan.nextDouble();
                if (runTime < 0) {
                    System.out.println("Error, Please try again");
                } else {
                    runCheck = true;
                }
            } else {
                System.out.println("Error");
            }
            scan.nextLine();
        } while(!runCheck);

        do {
            System.out.println("Enter the cost in dollars to recharge a battery fully");
            if(scan.hasNextDouble()) {
                chargeCost = scan.nextDouble();
                if (chargeCost < 0) {
                    System.out.println("Error, Please try again");
                } else {
                    costCheck = true;
                }
            } else {
                System.out.println("Error");
            }
            scan.nextLine();
        } while(!costCheck);


        //calculations
        costPerHour = 60 * (chargeCost / runTime);
        totalTime = (numCharge * runTime);

        //outputs

        System.out.printf("Total available minutes: %.2f minutes\n", totalTime);
        System.out.printf("Cost to run robot for 60 minutes: $%.2f\n", costPerHour);
    }
}