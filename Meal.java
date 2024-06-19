import javax.swing.*;
public class Meal {
   public static void main(String [] args) {
   
   double amount, tip, tax, total;
   
   String input = JOptionPane.showInputDialog(null, "Enter amount the for your meal ");
   amount = Double.parseDouble(input);
   
   tip = 0.15 * amount;
   tax = 0.07 * amount;
   total = amount + tip + tax;
   
   JOptionPane.showMessageDialog(null,
               "Your total cost for the meal is: $" + total + "\n" +
               "  meal = $" + amount + "\n" +
               "  tip = $" + tip + "\n" +
               "  tax = $" + tax + "\n");
               
   }
}