import java.util.*;
public class PigLatin {
   public static void main(String [] args) { 
      String word, pigWord;
      int index;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a word: ");
      word = input.next();
      
      word = word.toLowerCase();
      
      for(index = 0; index < word.length(); index++) {
         char ch = word.charAt(index);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || (ch == 'y' && index > 0))  break;
      }
         
      pigWord = word.substring(index) + word.substring(0, index) + "ay";
      
      System.out.println(pigWord);
   }
}