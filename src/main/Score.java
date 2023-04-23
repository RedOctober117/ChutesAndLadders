// Bruce
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * Score prints the final score for all players.
**/
public class Score {
    /**
     * Method to print the scores for all players.
     * @param p1 Token object
     * @param p2 Token object
     * @param p3 Token object
     * @param p4 Token object
    **/
    public static void printFinalScore(Token p1, Token p2, Token p3, Token p4) {
        System.out.printf("\nPlayer 1 scored %d%n", p1.getSpace());
        System.out.printf("Player 2 scored %d%n", p2.getSpace());
        System.out.printf("Player 3 scored %d%n", p3.getSpace());
        System.out.printf("Player 4 scored %d%n", p4.getSpace());
    }
    /**
     * Writes player spaces to file to store scores.
     * @param player1 Token
     * @param player2 Token
     * @param player3 Token
     * @param player4 Token
    **/
    public static void writeWinner(Token player1, Token player2, Token player3, Token player4) {
      String writeWinner = new String(player1.getInitial() + ", " + player1.getSpace() + "\n" + player2.getInitial() + ", " + player2.getSpace() + "\n" + player3.getInitial() + ", " + player3.getSpace() + "\n" + player4.getInitial() + ", " + player4.getSpace() + "\n");
      try {
      FileWriter fw = new FileWriter("winners.txt", true);
      fw.write(writeWinner);
      fw.close();
      } 
      catch (Exception e) {
        e.getStackTrace();
      }
    }
}
