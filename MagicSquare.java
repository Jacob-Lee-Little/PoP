public class MagicSquare {
   public static void main(String [] args) {
      int [][] square = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
      int [] rowSum = new int[square.length];
      int [] colSum = new int [square[0].length];
      int [] diagSum = new int[2];
      boolean goodRow, goodCol, goodDiag;
      
      printMatrix(square);
      goodRow = SumRows(square, rowSum);
      goodCol = SumColumns(square, colSum);
      goodDiag = SumDiagonals(square, diagSum);
      
      if(goodRow && goodCol && goodDiag)
         System.out.println("\nIt is a magic square");
      else
         System.out.println("\nIt is Not a magic square");
      
      printSums(rowSum, colSum, diagSum);
   }
   public static void printMatrix(int [][] square) {
      System.out.println("The matrix elements are:");
      for(int r = 0; r < square.length; r++) {
         for(int c = 0; c < square[r].length; c++)
            System.out.print(square[r][c] + " ");
         System.out.println();
      }
   }
   public static boolean SumRows(int [][] square, int [] rowSum) {
      boolean good = true;
      for(int r = 0; r < square.length; r++)
         for(int c = 0; c < square[r].length; c++)
            rowSum[r] += square[r][c];
      
      for(int i = 1; i < rowSum.length; i++)
         if(rowSum[i] != rowSum[i-1])
            good = false;
      
      return good;
   }
   public static boolean SumColumns(int [][] square, int [] colSum) {
      boolean good = true;
      for(int c = 0; c < square[0].length; c++)
         for(int r = 0; r < square.length; r++)
            colSum[c] += square[r][c];
      
      for(int i = 1; i < colSum. length; i++)
         if(colSum[i] != colSum [i-1])
            good = false;
      
      return good;
   }
   public static boolean SumDiagonals(int [][] square, int [] diagSum) {
      boolean good = true;
      int end = square.length - 1;
      
      for(int i = 0; i < square.length; i++) {
         diagSum[0] += square[i][i];
         diagSum[1] += square[i][end];
         end--;
      }
      
      if(diagSum[0] != diagSum[1])
         good = false;
      
      return good;
   }
   public static void printSums(int [] rowSum, int [] colSum, int [] diagSum) {
      for(int i = 0; i < rowSum.length; i++)
         System.out.println("\tRow" + (i+1) + " sum: " + rowSum[i]);
      for(int i = 0; i < colSum.length; i++)
         System.out.println("\tColumn" + (i+1) + " sum: " + colSum[i]);
      for(int i = 0; i < diagSum.length; i++)
         System.out.println("\tDiagonal" + (i+1) + " sum: " + diagSum[i]);
   }
}