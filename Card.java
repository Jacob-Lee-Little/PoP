public class Card {
   private String suit;
   private String rank;
   private int value;
   
   public void setSuit(int s) {
      if (s == 1)
         suit = "Spades";
      else if (s == 2)
         suit = "Hearts";
      else if (s == 3)
         suit = "Diamonds";
      else
         suit = "Clubs";
   }
   public void setRank(int v) {
      if (v == 1)
         rank = "Ace";
      else if (v == 11)
         rank = "Jack";
      else if (v == 11)
         rank = "Queen";
      else if (v == 11)
         rank = "King";
      else
         rank = Integer.toString(v);
   }
   public void setValue(int v) {
      if (v >10)
         value = 10;
      else
         value = v;
   }
   public String getSuit() {
      return suit;
   }
   public String getRank() {
      return rank;
   }
   public int getValue() {
      return value;
   }
}
