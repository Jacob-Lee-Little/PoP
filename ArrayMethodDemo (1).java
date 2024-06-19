import java.util.*;
public class ArrayMethodDemo {
   public static void main(String [] args) {
      int [] number = new int[10];
      int sum = 0, temp, limit;
      int smallest = number[0];
      int biggest = number[0];
      double average;
      Scanner input = new Scanner(System.in);
      
      //user input integer
      System.out.print("Enter 10 integers: ");
      for(int i = 0; i < 10; i++) 
         number[i] = input.nextInt();
         
      //user input limit
       System.out.print("Enter limiting argument: ");
       limit = input.nextInt();
      
      //all integers
      System.out.print("Integers entered: ");   
      for(int i = 0; i < 10; i++) {
         sum += number[i];
         if(i < 9)
            System.out.print(number[i] + ", ");
         else 
            System.out.print(number[i]);
      }
      
      //reverse order
      System.out.print("\nIntegers in reverse order: ");   
      for(int i = 9; i >= 0; i--) {
         if(i > 0)
            System.out.print(number[i] + ", ");
         else 
            System.out.print(number[i]);
      }

      
      //sum
      System.out.print("\nSum of integers: " + sum);
      
      //less than argument
      System.out.print("\nIntegers smaller than entered argument: ");
      for(int i = 0; i < 10; i++) {
         if(number[i] < limit - 1)
            System.out.print(number[i] + ", ");
         else if(number[i] < limit)
            System.out.print(number[i]);
      }
      
      //sorting
      for(int i = 0; i < 10; i++) {
         for(int j = i + 1; j < 10; j++) {
            if(number[i] > number[j]) {
               temp = number[i];
               number[i] = number[j];
               number[j] = temp;
            }
         }
      }
      
      //smallest
      System.out.print("\nSmallest integer: " + number[0]);
      
      //largest
      System.out.print("\nLargest integer: " + number[9]);
      
      //average
      average = 1.0 * sum / 10;
      System.out.print("\nAverage of integers: " + average);
   }
}