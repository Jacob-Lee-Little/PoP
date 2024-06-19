import java.util.*;
public class CeaserCipher {
   public static void main(String [] args) {
      String phrase = "";
      String newPhrase = "";
      char ch;
      int shift = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a message: ");
      phrase = input.nextLine();
      
      System.out.println("Enter your shift: ");
      shift = input.nextInt();
   
      phrase = phrase.toLowerCase();
      
      for(int i = 0; i < phrase.length(); i++) {
         ch = phrase.charAt(i);
         if(Character.isLetter(ch))
            if(shift > 0)
               if((ch+shift) > 'z')
                  ch += shift - 26;
               else
                  ch += shift;
            else
               if((ch+shift) < 'a')
                  ch += shift + 26;
               else
                  ch += shift;
         newPhrase += (char)ch;
      }
      System.out.println("Message:  " + phrase);
      System.out.println("Cipher:   " + newPhrase);
   }
}
