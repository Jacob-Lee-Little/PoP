import javax.swing.*;
public class Eggs {
   public static void main(String [] args) {
   int eggs, dozen;
   double costPerEgg, dozen2, costPerDozen, remainder, total;
   
   String input = JOptionPane.showInputDialog(null, "How many eggs would you like to order?  ");
   eggs = Integer.parseInt(input);
   
   dozen = 12;
   dozen2 = eggs / dozen;
   costPerDozen = 3.25 * (eggs / dozen);
   remainder = eggs % dozen;
   costPerEgg = 0.45 * remainder;
   total = costPerDozen + costPerEgg;
   
   JOptionPane.showMessageDialog(null,
               "You ordered " + eggs + " eggs." + "\n" +
               "That's " + dozen2 + " dozen at $3.25 per dozen and " + remainder + " loose eggs at 45 cents each." + "\n" +
               "your total is $" + total + "\n");
               
   }
}