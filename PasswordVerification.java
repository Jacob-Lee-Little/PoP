import javax.swing.*;
public class PasswordVerification {
   public static void main(String [] args) {
      String password = "";
      String directions = "\nTime to update your password" +
                          "\nYour password must contain at least: " +
                          "\n    8 chararcters" + 
                          "\n    1 letter" + 
                          "\n    1 digit" + 
                          "\n\nPlease enter your password: ";
      String invalid = "";
      boolean validLength = false;
      boolean validLetter = false;
      boolean validDigit = false;
      
      while (!validLength || !validLetter || !validDigit) {
         password = JOptionPane.showInputDialog(null, invalid + directions);
         validLength = checkLength(password);
         validLetter = checkLetter(password);
         validDigit = checkDigit(password);
         invalid = "";
         if(!validLength)
            invalid += "Needs to be at least 8 characters\n";
         if(!validLetter)
            invalid += "Needs to be at least 1 letter\n";
         if(!validDigit)
            invalid += "Needs to be at least 1 digit\n";
      }
      JOptionPane.showMessageDialog(null, "The password is valid(" + password + ")");
   }
   public static boolean checkLength(String password) {
      boolean check = false;
      if(password.length() >= 8)
         check = true;
      return check;
   }
   public static boolean checkLetter(String password) {
      boolean check = false;
      for(int i = 0; i < password.length(); i++)
         if(Character.isLetter(password.charAt(i)))
            check = true;
      return check;
   }
   public static boolean checkDigit(String password) {
      boolean check = false;
      for(int i = 0; i < password.length(); i++)
         if(Character.isDigit(password.charAt(i)))
            check = true;
      return check;
   }
}