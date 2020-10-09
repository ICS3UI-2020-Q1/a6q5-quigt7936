import java.util.Scanner;
/**
 * The program organizes a 2 index array in ascending order
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declare the array
    int[] userNumbers = new int[2];

    // get the two variables to put in the array
    System.out.println("Please enter the 2 values for the array");
    userNumbers[0] = input.nextInt();
    userNumbers[1]  = input.nextInt();

    // swap the smallest to 0
    int swapNumber;
    if (userNumbers[1] < userNumbers[0]) {
      // this just makes a circle with the values, swap takes index 1, index 1 takes index 0, index 0 takes swap. 
      swapNumber = userNumbers[1];
      userNumbers[1] = userNumbers[0];
      userNumbers[0] = swapNumber;
    }

    // tell the user the new order of the array
    System.out.println("Your numbers in ascending order are " + userNumbers[0] + " and " + userNumbers[1]);
    
  }
}
