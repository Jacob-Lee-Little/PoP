import java.util.*;
public class StudentScores {
   public static void main(String [] args) {
      int sum = 0, position = -1;
      double average = 0, length = 0;
      String [] name = {"Liam", "Olivia", "Noah", "Emma"};
      double [][] score = {{73, 31, 46, 72}, {28, 47, 80, 66}, {22, 53, 82, 73}, {93, 28, 44, 50}};
      String userName;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Class List: ");
      for(int i = 0; i < name.length; i++)
         if (i < (name.length - 1))
            System.out.print(name[i] + ", ");
         else
            System.out.print(name[i]);
            
      System.out.println("\nEnter name: ");
      userName = input.next();
      
      for(int i = 0; i < name.length; i++)
         if(userName.equals(name[i]))
            position = i;
      
      if(position != -1){
         System.out.println(userName + "'s test scores: ");
         for(int i = 0; i < name.length; i++)
            if(i < (name.length - 1))
               System.out.print(score[position][i] + ", ");
            else
               System.out.print(score[position][i]);
         length = score.length;      
         for(int i = 0; i < name.length; i++)
            sum += score[position][i];
         average = sum/length;
         System.out.println("\n" + userName + "'s average test score: " + average);
      }
      else
         System.out.println(userName + " is not a student");
   }
}