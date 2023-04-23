// Ryan, Christina, Donnie, Bruce
import java.util.Scanner;

/**
 * Chutes and Ladders written in Java.
**/
public class ChutesAndLadders {
  /** 
   * Main class 
   * @param args String[]
  **/
  public static void main(String[] args) {
    // Token(char initialInput, String modelInput, int playerX, int playerY){
    /*
     * Starting coordinates:
     * Player 1 (2,29)
     * Player 2 (4,29)
     * Player 3 (2,30)
     * Player 4 (4,30)
     * 
     * X-Axis increment: 6
     * Y-Axis increment: 3
     */

    Token player1 = new Token('1', 0, 0);
    Token player2 = new Token('2', 0, 0);
    Token player3 = new Token('3', 0, 0);
    Token player4 = new Token('4', 0, 0);

    Scanner in = new Scanner(System.in);
    System.out.print("How many players? Enter a number from 2 to 4: ");
    int playerNumber = in.nextInt();
    while (playerNumber != 2 && playerNumber != 3 && playerNumber != 4) {
      System.out.println("Invalid input");
      System.out.print("How many players? Enter a number from 2 to 4: ");
      playerNumber = in.nextInt();
    }

    // Board(int dimension, int playerCount, Token p1, Token p2, Token p3, Token
    // p4){
    Board b1 = new Board(10, playerNumber, player1, player2, player3, player4);
    b1.printBoard();
    // Turn Variables
    int updatedSpace = 0;
    int roll = 0;
    in = new Scanner(System.in);

    // TURN 1
    // PLAYER 1:
    System.out.print("Player 1: Type \"ready\" to roll your dice: ");
    String input = in.nextLine();
    while (!input.equalsIgnoreCase("ready")) {
      System.out.print("Player 1:  ");
      input = in.nextLine();
    }
    roll = ((int) (6.0 * Math.random()) + 1);
    player1.setPosition(player1.getSpaceX(roll), player1.getSpaceY(roll));
    b1.printBoard();
    System.out.println("You rolled a " + roll);
    if (player1.chuteCheck() != 0) {
      player1.setPosition(player1.getSpaceX(player1.chuteCheck()), player1.getSpaceY(player1.chuteCheck()));
      b1.printBoard();
      System.out.println("You landed on a chute space!");
    } else if (player1.ladderCheck() != 0) {
      player1.setPosition(player1.getSpaceX(player1.ladderCheck()), player1.getSpaceY(player1.ladderCheck()));
      b1.printBoard();
      System.out.println("You landed on a ladder space!");
    }
    System.out.println("You are on space: " + player1.getSpace());

    // PLAYER 2
    System.out.print("Player 2: Type \"ready\" to roll your dice: ");
    input = in.nextLine();
    while (!input.equalsIgnoreCase("ready")) {
      System.out.print("Player 2: Type \"ready\" to roll your dice: ");
      input = in.nextLine();
    }
    roll = ((int) (6.0 * Math.random()) + 1);
    player2.setPosition(player2.getSpaceX(roll), player2.getSpaceY(roll));
    b1.printBoard();
    System.out.println("You rolled a " + roll);
    if (player2.chuteCheck() != 0) {
      player2.setPosition(player2.getSpaceX(player2.chuteCheck()), player2.getSpaceY(player2.chuteCheck()));
      b1.printBoard();
      System.out.println("You landed on a chute space!");
    } else if (player2.ladderCheck() != 0) {
      player2.setPosition(player2.getSpaceX(player2.ladderCheck()), player2.getSpaceY(player2.ladderCheck()));
      b1.printBoard();
      System.out.println("You landed on a ladder space!");
    }
    System.out.println("You are on space: " + player2.getSpace());

    if (b1.getPlayerCount() >= 3) {
      // PLAYER 3
      System.out.print("Player 3: Type \"ready\" to roll your dice: ");
      input = in.nextLine();
      while (!input.equalsIgnoreCase("ready")) {
        System.out.print("Player 3: Type \"ready\" to roll your dice: ");
        input = in.nextLine();
      }
      roll = ((int) (6.0 * Math.random()) + 1);
      player3.setPosition(player3.getSpaceX(roll), player3.getSpaceY(roll));
      b1.printBoard();
      System.out.println("You rolled a " + roll);
      if (player3.chuteCheck() != 0) {
        player3.setPosition(player3.getSpaceX(player3.chuteCheck()), player3.getSpaceY(player3.chuteCheck()));
        b1.printBoard();
        System.out.println("You landed on a chute space!");
      } else if (player3.ladderCheck() != 0) {
        player3.setPosition(player3.getSpaceX(player3.ladderCheck()), player3.getSpaceY(player3.ladderCheck()));
        b1.printBoard();
        System.out.println("You landed on a ladder space!");
      }
      System.out.println("You are on space: " + player3.getSpace());
      if (b1.getPlayerCount() == 4) {
        // PLAYER 4
        System.out.print("Player 4: Type \"ready\" to roll your dice: ");
        input = in.nextLine();
        while (!input.equalsIgnoreCase("ready")) {
          System.out.print("Player 4: Type \"ready\" to roll your dice: ");
          input = in.nextLine();
        }
        roll = ((int) (6.0 * Math.random()) + 1);
        player4.setPosition(player4.getSpaceX(roll), player4.getSpaceY(roll));
        b1.printBoard();
        System.out.println("You rolled a " + roll);
        if (player4.chuteCheck() != 0) {
          player4.setPosition(player4.getSpaceX(player4.chuteCheck()), player4.getSpaceY(player4.chuteCheck()));
          b1.printBoard();
          System.out.println("You landed on a chute space!");
        } else if (player4.ladderCheck() != 0) {
          player4.setPosition(player4.getSpaceX(player4.ladderCheck()), player4.getSpaceY(player4.ladderCheck()));
          b1.printBoard();
          System.out.println("You landed on a ladder space!");
        }
        System.out.println("You are on space: " + player4.getSpace());
      }
    }

    // SUBSEQUENT TURNS
    while (player1.getSpace() < 100 && player2.getSpace() < 100 && player3.getSpace() < 100
        && player4.getSpace() < 100) {
      // PLAYER 1
      System.out.print("Player 1: Type \"ready\" to roll your dice: ");
      input = in.nextLine();
      while (!input.equalsIgnoreCase("ready")) {
        System.out.print("Player 1: Type \"ready\" to roll your dice: ");
        input = in.nextLine();
      }
      roll = (int) (6.0 * Math.random()) + 1;
      updatedSpace = player1.getSpace() + roll;
      player1.setPosition(player1.getSpaceX(updatedSpace), player1.getSpaceY(updatedSpace));
      b1.printBoard();
      System.out.println("You rolled a " + roll);
      if (player1.chuteCheck() != 0) {
        player1.setPosition(player1.getSpaceX(player1.chuteCheck()), player1.getSpaceY(player1.chuteCheck()));
        b1.printBoard();
        System.out.println("You landed on a chute space!");
      } else if (player1.ladderCheck() != 0) {
        player1.setPosition(player1.getSpaceX(player1.ladderCheck()), player1.getSpaceY(player1.ladderCheck()));
        b1.printBoard();
        System.out.println("You landed on a ladder space!");
      }
      System.out.println("You are on space: " + player1.getSpace());
      if (player1.getSpace() == 100) {
        System.out.print("Player 1 Wins!");
        Score.printFinalScore(player1, player2, player3, player4); 
          Score.writeWinner(player1, player2, player3, player4);
        break;
      }

      // PLAYER 2
      System.out.print("Player 2: Type \"ready\" to roll your dice: ");
      input = in.nextLine();
      while (!input.equalsIgnoreCase("ready")) {
        System.out.print("Player 2: Type \"ready\" to roll your dice: ");
        input = in.nextLine();
      }
      roll = (int) (6.0 * Math.random()) + 1;
      updatedSpace = player2.getSpace() + roll;
      player2.setPosition(player2.getSpaceX(updatedSpace), player2.getSpaceY(updatedSpace));
      b1.printBoard();
      System.out.println("You rolled a " + roll);
      if (player2.chuteCheck() != 0) {
        player2.setPosition(player2.getSpaceX(player2.chuteCheck()), player2.getSpaceY(player2.chuteCheck()));
        b1.printBoard();
        System.out.println("You landed on a chute space!");
      } else if (player2.ladderCheck() != 0) {
        player2.setPosition(player2.getSpaceX(player2.ladderCheck()), player2.getSpaceY(player2.ladderCheck()));
        b1.printBoard();
        System.out.println("You landed on a ladder space!");
      }
      System.out.println("You are on space: " + player2.getSpace());
      if (player2.getSpace() == 100) {
        System.out.print("Player 2 Wins!");
          Score.printFinalScore(player1, player2, player3, player4); 
          Score.writeWinner(player1, player2, player3, player4);
        break;
      }

      // NESTED LOOP
      // PLAYER 3
      if (b1.getPlayerCount() >= 3) {
        System.out.print("Player 3: Type \"ready\" to roll your dice: ");
        input = in.nextLine();
        while (!input.equalsIgnoreCase("ready")) {
          System.out.print("Player 3: Type \"ready\" to roll your dice: ");
          input = in.nextLine();
        }
        roll = (int) (6.0 * Math.random()) + 1;
        updatedSpace = player3.getSpace() + roll;
        player3.setPosition(player3.getSpaceX(updatedSpace), player3.getSpaceY(updatedSpace));
        b1.printBoard();
        System.out.println("You rolled a " + roll);
        if (player3.chuteCheck() != 0) {
          player3.setPosition(player3.getSpaceX(player3.chuteCheck()), player3.getSpaceY(player3.chuteCheck()));
          b1.printBoard();
          System.out.println("You landed on a chute space!");
        } else if (player3.ladderCheck() != 0) {
          player3.setPosition(player3.getSpaceX(player3.ladderCheck()), player3.getSpaceY(player3.ladderCheck()));
          b1.printBoard();
          System.out.println("You landed on a ladder space!");
        }
        System.out.println("You are on space: " + player3.getSpace());
        if (player3.getSpace() == 100) {
          System.out.print("Player 3 Wins!");
          Score.printFinalScore(player1, player2, player3, player4); 
          Score.writeWinner(player1, player2, player3, player4);
          break;
        }

        // PLAYER 4
        if (b1.getPlayerCount() == 4) {
          System.out.print("Player 4: Type \"ready\" to roll your dice: ");
          input = in.nextLine();
          while (!input.equalsIgnoreCase("ready")) {
            System.out.print("Player 4: Type \"ready\" to roll your dice: ");
            input = in.nextLine();
          }
          roll = (int) (6.0 * Math.random()) + 1;
          updatedSpace = player4.getSpace() + roll;
          player4.setPosition(player4.getSpaceX(updatedSpace), player4.getSpaceY(updatedSpace));
          b1.printBoard();
          System.out.println("You rolled a " + roll);
          if (player4.chuteCheck() != 0) {
            player4.setPosition(player4.getSpaceX(player4.chuteCheck()), player4.getSpaceY(player4.chuteCheck()));
            b1.printBoard();
            System.out.println("You landed on a chute space!");
          } else if (player4.ladderCheck() != 0) {
            player4.setPosition(player4.getSpaceX(player4.ladderCheck()), player4.getSpaceY(player4.ladderCheck()));
            b1.printBoard();
            System.out.println("You landed on a ladder space!");
          }
          System.out.println("You are on space: " + player4.getSpace());
          if (player4.getSpace() == 100) {
            System.out.print("Player 4 Wins!");
            Score.printFinalScore(player1, player2, player3, player4);
            Score.writeWinner(player1, player2, player3, player4);
            break;
          }
        }
      }
    }
  }
}
