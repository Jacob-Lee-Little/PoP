import javax.swing.*;
public class Quiz {
   public static void main(String [] args) {
      String [] questions = 
         {"How many players on a basketball team?" +
            "\n\na)  3  \nb)  5  \nc)  10 \nd)  11",
          "How many points for a free throw?" +
            "\n\na)  1  \nb)  2  \nc)  3  \nd)  4",
          "What is the name of Chicago's NBA team?" +
            "\n\na)  Bulls \nb)  Bears \nc)  Cubs  \nd)  BlackHawks",
          "A basketball game starts with a ____" + 
            "\n\na)  throw in \nb)  coint toss  \nc)  jump ball   \nd)  free throw",
          "Taking a step with the ball without dribbling?" +
            "\n\na)  stepping \nb)  walking  \nc)  dunking  \nd)  travellinmg"};
      char [] answers = {'b', 'a', 'a', 'c', 'd'};
      char guess = ' ';
      int correct = 0;
      String input, inputMsg;
      boolean isGood;
      
      for(int i = 0; i < questions.length; i++) {
         isGood = false;
         inputMsg = questions[i];
         while (!isGood) {
            input = JOptionPane.showInputDialog(null, inputMsg);
            guess = input.charAt(0);
            guess = Character.toLowerCase(guess);
            if(guess == 'a' || guess == 'b' || guess == 'c' || guess == 'd')
               isGood = true;
            else
               inputMsg = "Your answer must be a, b, c, or d\n\n" + questions[i];
         }
         if(guess == answers[i]) {
            correct++;
            JOptionPane.showMessageDialog(null, "Correct");
         }  
         else
            JOptionPane.showMessageDialog(null, "Incorrect\n" + 
                                                "The correct answer is " + answers[i]);
      }
      JOptionPane.showMessageDialog(null, "You got " + correct + " right out of " + questions.length);
   }   
}