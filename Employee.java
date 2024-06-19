import java.util.*;
public class Employee {
   private String name = inputMethod1("Enter Employee name: "); 
   private double wage = inputMethod2("Enter hourly wage: ");
   private double hours = inputMethod2("Enter hours worked for the week: ");
   
   public static String inputMethod1(String msg) {
      Scanner input = new Scanner (System.in);
      String usersInput;
      System.out.print(msg);
      usersInput = input.next();
      return usersInput;
   }
   public static double inputMethod2(String msg) {
      Scanner input = new Scanner (System.in);
      double usersInput;
      System.out.print(msg);
      usersInput = input.nextDouble();
      return usersInput;
   }
   public String getName() {
      return name;
   }
   public double getWage() {
      return wage;
   }
   public double getHours() {
      return hours;
   }
   public double getPay() {
      double pay = wage * hours;
      return pay;
   }
   public void display() {
      System.out.println(name + ", at $" + wage + " per hour for " + hours + " hours, your weekly pay is $" + getPay());
   }
}   