import javax.swing.*;
public class rightTriangle {
   public static void main(String [] args) {
      int angle1, angle2, base;
      double height, sin, cos, tan, hypot, radianAngle1;
      
      angle1 = inputInformation("Right Triangle Calculator \n\nEnter your angle (in degrees: )");
      base = inputInformation("Right Triangle Calculator \n\nEnter your base length");
      
      angle2 = 90 - angle1;
      radianAngle1 = Math.toRadians(angle1);
      
      sin = roundValue(Math.sin(radianAngle1));
      cos = roundValue(Math.cos(radianAngle1));
      tan = roundValue(Math.tan(radianAngle1));
      
      height = tan * base;
      hypot = roundValue(Math.hypot(base, height));
      
      JOptionPane.showMessageDialog(null, "Right Triangle Calculator" + 
                                          "\n\nYou have a " + angle1 + " - " + angle2 + " - 90 degree triangle" + 
                                          "\nThe three sides measure: " + base + ", " + height + ", " + hypot + 
                                          "\n      sin(" + angle1 + ") = " + sin +
                                          "\n      cos(" + angle1 + ") = " + cos +
                                          "\n      tan(" + angle1 + ") = " + tan +
                                          "\n\nHave a great day");
   }
   public static int inputInformation(String msg) {
      int value;
      String input;
      input = JOptionPane.showInputDialog(null, msg);
      value = Integer.parseInt(input);
      return value;
   }
   public static double roundValue(double value) {
      value = Math.round(value * 100) / 100.0;
      return value;
   }
}