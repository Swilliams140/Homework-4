import java.util.Scanner;
import java.util.InputMismatchException;
public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[2];
        int sum = 0;

        //for loop to add the valuse together
        for (int i = 0; i < 2; i++) {
            boolean CorrectInput = false;
            //while loops that keeps asking the uses to enter values
            while (!CorrectInput) {
                try {
                    System.out.println("Enter an Integer: ");
                    x[i] = input.nextInt();
                    sum = sum + x[i];
                    CorrectInput = true;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("That was not an integer. Please try again.");
                }
            }
        }
        System.out.println("The sum of the two numbers is: " + sum);
        input.close();
    }
}