/**
 * Board allows a user to draw a Chutes and Ladders playspace and its players with a single command
 **/
public class Board{
  private int playerCount;
  private int dimension;
  private Token p1;
  private Token p2;
  private Token p3;
  private Token p4;
/**
 * Board takes six parameters and prints the cooresponding board. 
 * @param dimension of the board.
 * @param playerCount takes the number of active players.
 * @param p1 is player 1's object.
 * @param p2 is player 2's object.
 * @param p3 is player 3's object.
 * @param p4 is player 4's object.
 **/
public Board(int dimension, int playerCount, Token p1, Token p2, Token p3, Token p4){
  this.dimension = dimension;
  this.playerCount = playerCount;
  this.p1 = p1;
  this.p2 = p2;
  this.p3 = p3;
  this.p4 = p4;
  // Create dummy variable to print initial line.
  int a = 0;
  // Determine the number of players.
  switch (playerCount){
    case 1:
      // Print top of board.
      while (a <= dimension * 6){
        System.out.print("*");
        a++;
      }
      // Move to next line for further printing.
      System.out.print("\n");
      // The following `for` block will print the next 31 rows of the board.
      for (int i = 1; i < 31 ; i++){
        // Determine if the line should be a border (i % 3 == 0), or a play space.
        if(i % 3 == 0){
          // Print border.
          for(int b = 0; b <= dimension * 6; b++){
            System.out.print("*");
          }
        // If it is not a horizontal border, it must be a row of play space.
        } else {
          // Determine the size of the board.
          for(int j = 0; j <= dimension * 6; j++){
            // If player1's location matches the j and i of the printer, print the initial of player1.
            if(p1.getPlayerX() == j && p1.getPlayerY() == i){
              System.out.printf("%c", p1.getInitial());
            // If the j of the printer is as follows, print the vertical border.
            } else if(j % 6 == 0){
              System.out.print("*");
            // If not a border or a player, print an empty space.
            } else {
              System.out.print(" ");
            }
          }
        }
        // After printing a row, move to the next row.
        System.out.print("\n");
      }
      break;
    case 2:
      // Print top of board.
      while (a <= dimension * 6){
        System.out.print("*");
        a++;
      }
      // Move to next line for further printing.
      System.out.print("\n");
      // The following `for` block will print the next 31 rows of the board.
      for (int i = 1; i < 31 ; i++){
        // Determine if the line should be a border (i % 3 == 0), or a play space.
        if(i % 3 == 0){
          // Print border.
          for(int b = 0; b <= dimension * 6; b++){
            System.out.print("*");
          }
        // If it is not a horizontal border, it must be a row of play space.
        } else {
          // Determine the size of the board.
          for(int j = 0; j <= dimension * 6; j++){
            // If player1 or 2's location matches the j and i of the printer, print the initial of player1 or 2.
            if((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i)){
              if(p1.getPlayerX() == j && p1.getPlayerY() == i){
            // If player1 resides at the (j,i) coords, print player1's initial, else print 2's.
                System.out.printf("%c", p1.getInitial());
              } else {
                System.out.printf("%c", p2.getInitial());
              }
            // If the j of the printer is as follows, print the vertical border.
            } else if(j % 6 == 0){
              System.out.print("*");
            // If not a border or a player, print an empty space.
            } else {
              System.out.print(" ");
            }
          }
        }
        // After printing a row, move to the next row.
        System.out.print("\n");
      }
      break;
      
    case 3:
      // Print top of board.
      while (a <= dimension * 6){
        System.out.print("*");
        a++;
      }
      // Move to the next line for further printing.
      System.out.print("\n");
      // The following `for` block will print the next 31 rows of the board.
      for (int i = 1; i < 31 ; i++){
        // Determing if the line should be a border (i % 3 == 0), or a play space.
        if(i % 3 == 0){
          // Print border.
          for(int b = 0; b <= dimension * 6; b++){
            System.out.print("*");
          }
        // If it is not a horizontal border, it must be a row of play space.
        } else {
          // Determine the size of the board.
          for(int j = 0; j <= dimension * 6; j++){
            // If player1, 2, or 3's location matches the j and i of the printer, print the initial of the cooresponding player.
            if((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i) || (p3.getPlayerX() == j && p3.getPlayerY() == i)){
              if(p1.getPlayerX() == j && p1.getPlayerY() == i){
                // If player1 resides at the (j,i) coords, print player1's initial.
                System.out.printf("%c", p1.getInitial());
              } else if (p2.getPlayerX() == j && p2.getPlayerY() == i){
                // If player2 resides at the (j,i) coords, print player2's initial.
                System.out.printf("%c", p2.getInitial());
              } else {
                // If player3 resides at the (j,i) coords, print player3's initial.
                System.out.printf("%c", p3.getInitial());
              }
            // If the j of the printer is as follows, print the vertical border.
            } else if(j % 6 == 0){
              System.out.print("*");
            // If not a border or a player, print an empty space.
            } else {
              System.out.print(" ");
            }
          }
        }
        // After printing a row, move to the next row.
        System.out.print("\n");
      }
      break;

    case 4:
      // Print top of board.
      while (a <= dimension * 6){
        System.out.print("*");
        a++;
      }
      // Move to the next line for further printing.
      System.out.print("\n");
      // The following `for` block will print the next 31 rows of the board.
      for (int i = 1; i < 31 ; i++){
        // Determine if the row should be a border (i % 3 == 0), or a play space.
        if(i % 3 == 0){
          // Print the border.
          for(int b = 0; b <= dimension * 6; b++){
            System.out.print("*");
          }
        // If it is not a horizontal border, it must be a row of play space.
        } else {
          // Determing the width of the board to print non-border rows.
          for(int j = 0; j <= dimension * 6; j++){
            // Determine if any player's (j,i) match the printers (j,i). If one does, proceed to the `if` block to determine who.
            if((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i) || (p3.getPlayerX() == j && p3.getPlayerY() == i) || (p4.getPlayerX() == j && p4.getPlayerY() == i)){
              // Determine if player1's coords match the printer's coords.
              if(p1.getPlayerX() == j && p1.getPlayerY() == i){
                //Print their initial.
                System.out.printf("%c", p1.getInitial());
                // player2?
              } else if (p2.getPlayerX() == j && p2.getPlayerY() == i){
                System.out.printf("%c", p2.getInitial());
                // player3?
              } else if (p3.getPlayerX() == j && p3.getPlayerY() == i){
                System.out.printf("%c", p3.getInitial());
                // If its not player1-3, it must be 4.
              } else {
                System.out.printf("%c", p4.getInitial());
              }
            // If it's not a player, check if it's a vertical border.
            } else if(j % 6 == 0){
              System.out.print("*");
            // If it's not a player or a border, it's a blank space.
            } else {
              System.out.print(" ");
            }
          }
        }
        // Move to the next row for more printing.
        System.out.print("\n");
      }
      break;
}
}
/********************************
 *                              *
 *         Tester Class         *
 *                              *
 *******************************/
 
  public static void main(String[] args){
    //Token(char initialInput, String modelInput, int playerY, int playerX){
    Token player1 = new Token('a', "test", 2, 2);
    Token player2 = new Token('b', "test", 4, 2);
    Token player3 = new Token('c', "test", 2, 3);
    Token player4 = new Token('d', "test", 4, 3);

    //Board(int dimension, int playerCount, Token p1, Token p2, Token p3, Token p4){
    Board b1 = new Board(10, 4, player1, player2, player3, player4);
    System.out.print(b1);
  }
}
