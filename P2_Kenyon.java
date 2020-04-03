/**
   Program #2

   Function:   Application that asks for three integers from the user then prints out
               the sum, average, product, smallest, and largest of the three numbers

   Programmed By: Kenyon Bradley, 3/23/2020

*/

import java.util.Scanner;

public class P2_Kenyon
{
   public static void main(String[] args) {
      int userInt[] = new int[3]; // Initialize integer array with amount of integers
      
      getIntegers(userInt);
      printData(userInt);
   } // end method main
   
   public static int[] getIntegers(int in[]) {
      
      String numToText[] = {"First", "Second", "Third"}; // String array to customize input text
      Scanner userInput = new Scanner(System.in); // Create scanner for user input
      System.out.print("Please enter three integers (whole numbers)\n-------------------------------------------\n\n"); // Application Header
      
      // Loop to assign integers to array
      for (int i=0;i<in.length; i++) {
         System.out.print("Please enter your " + numToText[i] + " integer:\t");
         in[i] = userInput.nextInt();
      }
      System.out.println(); // Blank line after inputs
      return in;
   } // end method getIntegers
   
   public static void printData(int in[]) {
      // initialize variables
      int sum=0, avg=0, product=0, smallest=in[0], largest=in[0];
      
      // Loop iterates through each item in array
      for (int i=0; i<in.length;i++) {
         sum += in[i]; // Add each integer to variable sum
         
         // If statement sets the product var to index 0 of the array
         //  then multiplies each additional index by the product var
         if (i == 0)
            product = in[i];
         else
            product *= in[i];
         
         // Conditional statements to test for smallest and largest integers   
         smallest = smallest > in[i] ? in[i] : smallest;
         largest = largest < in[i] ? in[i] : largest;
      }
      
      avg = sum/in.length; // Calculates the average of all integers
      
      // Print values to screen
      System.out.println("Sum of integers:\t" + sum);
      System.out.println("Average of integers:\t" + avg);
      System.out.println("Product of integers:\t" + product);
      System.out.println("Smallest integer:\t" + smallest);
      System.out.println("Largest integer:\t" + largest);
   } // end method printData
}  // end class P2_Kenyon

