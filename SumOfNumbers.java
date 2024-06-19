import java.util.*;
public class SumOfNumbers {
   public static void main(String [] args) {
   int num, natNum, sum = 0;
   Scanner input = new Scanner(System.in);
      
   System.out.println("Enter a natural number: ");
   natNum = input.nextInt();
   
   num = natNum;
   
   System.out.println("The first " + natNum + " natural numbers are");
   
   for (num = 1; num <= natNum; num++) {
      System.out.print(" " + num);
      sum += num;
   }
   System.out.println("\nThe sum is " + sum);
   }
}