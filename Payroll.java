import java.util.*;
public class Payroll {
   public static void main(String [] args) {
      int level;
      double hours;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter skill level (1, 2, 3): ");
      level = input.nextInt();
      
      System.out.println("Enter hours worked: ");
      hours = input.nextDouble();

      if(hours < 40) {
         if(level == 1)
            System.out.println("Your net pay for level " + level + " with " + hours + " is $" + (hours * 17));
         if(level == 2)
            System.out.println("Your net pay for level " + level + " with " + hours + " is $" + (hours * 20));
         if(level == 3)
            System.out.println("Your net pay for level " + level + " with " + hours + " is $" + (hours * 22));
      }
      else if(hours > 40) {
         if(level == 1)
            System.out.println("Your net pay for level " + level + " with " + hours + " is $" + ((40 * 17) + ((hours - 40) * 1.5 * 17)));
         if(level == 2)
            System.out.println("Your net pay for level " + level + " with " + hours + " is $" + ((40 * 20) + ((hours - 40) * 1.5 * 20)));
         if(level == 3)
            System.out.println("Your net pay for level " + level + " with " + hours + " is $" + ((40 * 22) + ((hours - 40) * 1.5 * 22)));
      }
   }
}