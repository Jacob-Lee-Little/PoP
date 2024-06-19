import java.util.*;
public class Calculator {
   public static void main(String [] args) {
      double num1, num2, answer = 0;
      char operator;
      boolean validOperator = true, divisionByZero = false;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to our calculator");
      System.out.println("Enter your problem (ex: 5 + 2)");
      
      num1 = input.nextDouble();
      operator = input.next().charAt(0);
      num2 = input.nextDouble();
      
      switch(operator) {
         case '+': answer = num1 + num2; break;
         case '-': answer = num1 - num2; break;
         case '*': answer = num1 * num2; break;
         case '/': if(num2 == 0)
                     divisionByZero = true;
                   else
                     answer = num1 / num2;
                   break;
         case '%': answer = num1 % num2; break;
         case '^': answer = Math.pow(num1, num2); break;
         default: validOperator = false;
      }
         
      if(validOperator)
         if(divisionByZero)
            System.out.println(num1 + " " + operator + " " + num2 + " !Cannot divide by zero!");
      else   
         System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
      else 
         System.out.println("invalid operator");
   }
}