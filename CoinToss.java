import java.util.*;
public class CoinToss {
   public static void main(String [] args) {
      int numTosses, value, headCount = 0, tailCount = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many coin tosses?");
      numTosses = input.nextInt();
      
      for (int i = 0; i< numTosses; i++) {
         value = (int)(Math.random() * 2) + 1;
         if(value ==1) {
            headCount++;
         }
         else {
            tailCount++;
         }
      }
      System.out.println("For " + numTosses + " tosses of a coin, the results are:");
      System.out.println("   " + (100.0*headCount/numTosses) + "% heads (" + headCount + " out of " + numTosses + ")");
      System.out.println("   " + (100.0*tailCount/numTosses) + "% tails (" + tailCount + " out of " + numTosses + ")");
   }
}