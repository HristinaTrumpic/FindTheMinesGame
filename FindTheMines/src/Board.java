import java.util.Arrays;
import java.util.Random;

public class Board {

     // Each element of array represents one field on board
     private boolean[][] board;

     // Hint numbers for each row
     private int[][] blackFieldsNumRow;

     // Hint numbers for each column
     private int[][] blackFieldsNumCol;


     public Board() {

          board = new boolean[10][10];
          blackFieldsNumRow = new int[10][5];
          blackFieldsNumCol = new int[5][10];
          randomize();

     }

     public boolean getBoardField(int row, int col) {
          return board[row][col];
     }

     public int getBlackFieldsNumRow(int row, int col) {
          return blackFieldsNumRow[row][col];
     }

     public int getBlackFieldsNumCol(int row, int col) {
          return blackFieldsNumCol[row][col];
     }

     public void randomize() {

          // create random field value
          Random random = new Random();

          // assign value to each field
          for (int r = 0; r < 10; r++) {
               for (int c = 0; c < 10; c++) {
                    board[r][c] = random.nextBoolean();
               }
          }

          // assign hint number for each row based on number of black fields
          for (int r = 0; r < 10; r++) {
               int counterBlackField = 0;
               int hintNum = 0;
               for (int c = 0; c < 10; c++) {
                    if (board[r][c]) {
                         counterBlackField ++;
                    }
                    if ((!board[r][c] && counterBlackField > 0) || c == 9) {
                         blackFieldsNumRow[r][hintNum] = counterBlackField;
                         counterBlackField = 0;
                         hintNum++;
                    }
               }
          }

          // assign hint number for each column based on number of black fields
          for (int c = 0; c < 10; c++) {
               int counterBlackField = 0;
               int hintNum = 0;
               for (int r = 0; r < 10; r++) {
                    if (board[r][c]) {
                         counterBlackField ++;
                    }
                    if ((!board[r][c] && counterBlackField > 0) || r == 9) {
                         blackFieldsNumCol[hintNum][c] = counterBlackField;
                         counterBlackField = 0;
                         hintNum++;
                    }
               }
          }

          System.out.println("Board is: " + Arrays.deepToString(board));
          System.out.println("Number of black fields in column are: " + Arrays.deepToString(blackFieldsNumCol));
          System.out.println("Number of black fields in row are: " + Arrays.deepToString(blackFieldsNumRow));

     }

}
