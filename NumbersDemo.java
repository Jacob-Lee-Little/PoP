import java.util.*;
public class NumbersDemo {
   public static void main(String [] args) {
      int number, twoTimes, plusFive, numberSquared;
      number = userInput("Enter number: ");
      twoTimes = displayTwiceTheNumber(number);
      plusFive = displayNumberPlusFive(number);
      numberSquared = displayNumberSquared(number);
      display(number, twoTimes, plusFive, numberSquared);
   }
   public static int userInput(String msg) {
      int number;
      Scanner input = new Scanner(System.in);
      System.out.print(msg);
      number = input.nextInt();
      return number;
   }
   public static int displayTwiceTheNumber(int number) {
      int twoTimes;
      twoTimes = number * 2;
      return twoTimes;
   }
   public static int displayNumberPlusFive(int number) {
      int plusFive;
      plusFive = number + 5;
      return plusFive;
   }
   public static int displayNumberSquared(int number) {
      int numberSquared;
      numberSquared = number * number;
      return numberSquared;
   }
   public static void display(int number, int twoTimes, int plusFive, int numberSquared) {
      System.out.println(number + " * 2 = " + twoTimes);
      System.out.println(number + " + 5 = " + plusFive);
      System.out.println(number + " ^2 = " + numberSquared);
   }
}