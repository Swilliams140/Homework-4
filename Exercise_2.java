/*
Write a porgram to randomly create an array of 50 double values. Prompt the user
to enter an index. Anything 50 or greater should produce a an error message to the user.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Exercise_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Create an array list that adds 50 random values
        ArrayList<Double> r50 = new ArrayList<Double>();
        for(int i = 0; i < 50; i++) {
            r50.add(Math.random() * 100);
        }
        //Print all the values to the user
        System.out.println("Random double values: "+ r50);

        boolean cInput = false;
        //Keep asking the User to enter a value until it's a correct value
        while (!cInput){
            try{
                //Ask the user to enter the question
                System.out.println("Enter a Index (0-49): ");
                int index = input.nextInt();

                //Get the value at the index
                double value = r50.get(index);

                //Print out to the user the value corresponding to the index.
                System.out.println("Value at index"+ index +" :"+ value);
                cInput = true;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.print("Please enter a valid Index.");
            }catch (Exception e){
                //Check for other exceptions
                System.out.println("Please enter a number between 0 and 49 (Inclusive).");
                //close the invalid input
                input.next();
            }
        }
        //close the Scanner
        input.close();
    }

}
