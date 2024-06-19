import java.util.*;
public class QuadraticEquation {
   double a, b, c, x1, x2;
   public void setCoefficients(double A, double B, double  C) {
      a = A;
      b = B;
      c = C;
      calculateSolutions(a, b, c);
   }
   public void calculateSolutions(double A, double B, double C) {
      x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
      x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
   }
   public double getA() { 
      return a;
   }
   public double getB() { 
      return b;
   }
   public double getC() { 
      return c;
   }
   public double getX1() { 
      return x1;
   }
   public double getX2() { 
      return x2;
   }
   public void display() {
      calculateSolutions(a, b, c);
      System.out.println("Your equation :");
      System.out.println("\t" + a + "x^2 + " + b + "x + " + c + " = 0");
      System.out.println("solutions are: " + x1 + ", " + x2);
   }
}

class useQuadraticEquation {
   public static void main(String [] args) {
      QuadraticEquation ans = new QuadraticEquation();
      double a, b, c, x1, x2;
      
      System.out.println("this program solves the quadratic equation ax^2 + bx + c = 0");
      a = inputMethod("Enter the 1st coefficent 'a': ");
      b = inputMethod("Enter the 2nd coefficent 'b': ");
      c = inputMethod("Enter the 3rd coefficent 'c': ");
      
      ans.setCoefficients(a, b, c);
      ans.display();
   }
   public static double inputMethod(String msg) {
      Scanner input = new Scanner (System.in);
      double number;
      System.out.print(msg);
      number = input.nextDouble();
      return number;
   }
}