import java.util.Scanner;

public class minAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter number:");
            boolean isValid = scan.hasNextInt();

            if(isValid) {
                int number = scan.nextInt();
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                System.out.println("Invalid value");
                break;
            }
            scan.nextLine();
        }

        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);

        scan.close();
    }
}
