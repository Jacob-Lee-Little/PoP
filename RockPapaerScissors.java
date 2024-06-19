import javax.swing.*;
public class RockPapaerScissors {
   public static void main(String [] args) {
      int user, computer;
      String input, msg = "", choice;
      
      input = JOptionPane.showInputDialog(null, "ROCK PAPER SCISSORS \n\n" + 
                                                "Play against the computer \n" + 
                                                "Choose one of the following: \n\n" + 
                                                "1) Rock \n" + 
                                                "2) Paper \n" + 
                                                "3) Scissors \n\n");
      user = Integer.parseInt(input);
      
      computer = (int)(Math.random() * 3) + 1;
      
      if(user == 1)
         choice = "ROCK";
      else if(user == 2)
         choice = "PAPER";
      else if(user ==3)
         choice = "SCISSORS";
      else{
         choice = "SCISSORS";
         JOptionPane.showMessageDialog(null, "Invalid choice " + user + "\nDefaulted to scissors");
      }
      
      if(user == computer)
         msg = "Game is a draw \nBoth chose " + choice;
      else if (user == 1)
         if(computer == 2)
            msg = "You lose \nPaper covers rock";
         else 
            msg = "You win \nRock breaks scissors";
      else if (user == 2)
         if(computer == 1)
            msg = "You win \nPaper covers rock";
         else 
            msg = "You lose \nScissors cut paper";
      else
         if(computer == 1)
            msg = "You lose \nRock breaks scissors";
         else 
            msg = "You win \nScissors cut paper";
   
      JOptionPane.showMessageDialog(null, msg);
   }
}