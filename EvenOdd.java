import java.util.*;
public class EvenOdd {
   public static void main(String [] args) {
      int number; 
      Scanner input = new Scanner(System.in);
      
      System.out.println("This program determines if a number is odd or even");
      System.out.print("Enter your number: ");
      number = input.nextInt();
      
      if(number < 0)
         System.out.println("Number cannot be negative");
      else if(number % 2 == 0)
         System.out.println(number + " is even");
      else 
         System.out.println(number + " is odd");
   }
}