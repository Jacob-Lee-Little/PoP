import java.util.*;
public class PhraseInfo {
   public static void main(String [] args) {
      String phrase;
      int countVowels = 0, countWords = 1, length, i, j, l;
      char ch;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a phrase: ");
      phrase = input.nextLine();
      
      length = phrase.length();
            
      for(j = 0; j < length; j++) {
         ch = phrase.charAt(j);
         if(ch == ' ') 
            countWords++;
         else if(ch == ' ') {
            if(phrase.charAt(j + 1) == ' ')
               countWords++;
         }
      }
      
      for(i = 0; i < length; i++) {
         ch = phrase.charAt(i);
         ch = Character.toLowerCase(ch);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            countVowels++;
      }
      
      System.out.print("Your phrase: " + phrase +  
                         "\n  has " + countWords + " words and " + countVowels + " vowels" +
                         "\n  coded: ");
      
      for(l = 0; l < length; l++) {
         ch = phrase.charAt(l);
         ch = Character.toLowerCase(ch);
         if(Character.isLetter(ch) == true){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ')
               continue;
            else
               System.out.print(phrase.charAt(l));
            }
         else
            continue;
      }
   }
}