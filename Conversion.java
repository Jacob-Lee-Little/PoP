import javax.swing.*;
public class Conversion {
   public static void main(String [] args) {
      int inches;
      double centimeteres;
      inches = userInput();
      centimeteres = inchesToCentimeters(inches);
      display(inches, centimeteres);
      
   }
   public static int userInput() {
      int inches;
      String input;
      input = JOptionPane.showInputDialog(null,"Welcome to Inch to Centimeter Converter \n" + 
                                               "This program will convert your inches value to centimeters \n" +
                                               "   1cm = 2.54in \n\n" +
                                               "Enter your inches: \n\n");
      inches = Integer.parseInt(input);
      return inches;
   }
   public static double inchesToCentimeters(int inches) {
      double centimeteres;
      centimeteres = 2.54 * inches;
      return centimeteres;
   }
   public static void display(int inches, double centimeters) {
      JOptionPane.showMessageDialog(null,"Inch to Centimeter Converter \n\n" + 
                                         inches + " inches = " + centimeters + " cm");
   }
}