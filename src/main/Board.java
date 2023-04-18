/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutes;

import java.util.Scanner;

/**
 * Board allows a user to draw a Chutes and Ladders playspace and its players with a single command.
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
public void printBoard(){
    int a = 0;
    // Determine the number of players.
    switch (playerCount) {
        case 1:
            // Print top of board.
            while (a <= dimension * 6) {
                System.out.print("*");
                a++;
            }
            // Move to next line for further printing.
            System.out.print("\n");
            // The following `for` block will print the next 31 rows of the board.
            for (int i = 1; i < 31; i++) {
                // Determine if the line should be a border (i % 3 == 0), or a play space.
                if (i % 3 == 0) {
                    // Print border.
                    for (int b = 0; b <= dimension * 6; b++) {
                        System.out.print("*");
                    }
                    // If it is not a horizontal border, it must be a row of play space.
                } else {
                    // Determine the size of the board.
                    for (int j = 0; j <= dimension * 6; j++) {
                        // If player1's location matches the j and i of the printer, print the initial of player1.
                        if (p1.getPlayerX() == j && p1.getPlayerY() == i) {
                            System.out.printf("%c", p1.getInitial());
                            // If the j of the printer is as follows, print the vertical border.
                        } else if (j % 6 == 0) {
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
            while (a <= dimension * 6) {
                System.out.print("*");
                a++;
            }
            // Move to next line for further printing.
            System.out.print("\n");
            // The following `for` block will print the next 31 rows of the board.
            for (int i = 1; i < 31; i++) {
                // Determine if the line should be a border (i % 3 == 0), or a play space.
                if (i % 3 == 0) {
                    // Print border.
                    for (int b = 0; b <= dimension * 6; b++) {
                        System.out.print("*");
                    }
                    // If it is not a horizontal border, it must be a row of play space.
                } else {
                    // Determine the size of the board.
                    for (int j = 0; j <= dimension * 6; j++) {
                        // If player1 or 2's location matches the j and i of the printer, print the initial of player1 or 2.
                        if ((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i)) {
                            if (p1.getPlayerX() == j && p1.getPlayerY() == i) {
                                // If player1 resides at the (j,i) coords, print player1's initial, else print 2's.
                                System.out.printf("%c", p1.getInitial());
                            } else {
                                System.out.printf("%c", p2.getInitial());
                            }
                            // If the j of the printer is as follows, print the vertical border.
                        } else if (j % 6 == 0) {
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
            while (a <= dimension * 6) {
                System.out.print("*");
                a++;
            }
            // Move to the next line for further printing.
            System.out.print("\n");
            // The following `for` block will print the next 31 rows of the board.
            for (int i = 1; i < 31; i++) {
                // Determing if the line should be a border (i % 3 == 0), or a play space.
                if (i % 3 == 0) {
                    // Print border.
                    for (int b = 0; b <= dimension * 6; b++) {
                        System.out.print("*");
                    }
                    // If it is not a horizontal border, it must be a row of play space.
                } else {
                    // Determine the size of the board.
                    for (int j = 0; j <= dimension * 6; j++) {
                        // If player1, 2, or 3's location matches the j and i of the printer, print the initial of the cooresponding player.
                        if ((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i) || (p3.getPlayerX() == j && p3.getPlayerY() == i)) {
                            if (p1.getPlayerX() == j && p1.getPlayerY() == i) {
                                // If player1 resides at the (j,i) coords, print player1's initial.
                                System.out.printf("%c", p1.getInitial());
                            } else if (p2.getPlayerX() == j && p2.getPlayerY() == i) {
                                // If player2 resides at the (j,i) coords, print player2's initial.
                                System.out.printf("%c", p2.getInitial());
                            } else {
                                // If player3 resides at the (j,i) coords, print player3's initial.
                                System.out.printf("%c", p3.getInitial());
                            }
                            // If the j of the printer is as follows, print the vertical border.
                        } else if (j % 6 == 0) {
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
            while (a <= dimension * 6) {
                System.out.print("*");
                a++;
            }
            // Move to the next line for further printing.
            System.out.print("\n");
            // The following `for` block will print the next 31 rows of the board.
            for (int i = 1; i < 31; i++) {
                // Determine if the row should be a border (i % 3 == 0), or a play space.
                if (i % 3 == 0) {
                    // Print the border.
                    for (int b = 0; b <= dimension * 6; b++) {
                        System.out.print("*");
                    }
                    // If it is not a horizontal border, it must be a row of play space.
                } else {
                    // Determing the width of the board to print non-border rows.
                    for (int j = 0; j <= dimension * 6; j++) {
                        // Determine if any player's (j,i) match the printers (j,i). If one does, proceed to the `if` block to determine who.
                        if ((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i) || (p3.getPlayerX() == j && p3.getPlayerY() == i) || (p4.getPlayerX() == j && p4.getPlayerY() == i)) {
                            // Determine if player1's coords match the printer's coords.
                            if (p1.getPlayerX() == j && p1.getPlayerY() == i) {
                                //Print their initial.
                                System.out.printf("%c", p1.getInitial());
                                // player2?
                            } else if (p2.getPlayerX() == j && p2.getPlayerY() == i) {
                                System.out.printf("%c", p2.getInitial());
                                // player3?
                            } else if (p3.getPlayerX() == j && p3.getPlayerY() == i) {
                                System.out.printf("%c", p3.getInitial());
                                // If its not player1-3, it must be 4.
                            } else {
                                System.out.printf("%c", p4.getInitial());
                            }
                            // If it's not a player, check if it's a vertical border.
                        } else if (j % 6 == 0) {
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
    //Token(char initialInput, String modelInput, int playerX, int playerY){
    /* Starting coordinates:  
        Player 1 (2,29)
        Player 2 (4,29)
        Player 3 (2,30)
        Player 4 (4,30)
        
        X-Axis increment: 6
        Y-Axis increment: 3
    */
    
    Token player1 = new Token('1', "test", 0, 0);
    Token player2 = new Token('2', "test", 0, 0);
    Token player3 = new Token('3', "test", 0, 0);
    Token player4 = new Token('4', "test", 0, 0);

    Scanner in = new Scanner(System.in);
    System.out.print("How many players? Enter a number from 2 to 4: ");
    int playerNumber = in.nextInt();
    while(playerNumber != 2 && playerNumber != 3 && playerNumber != 4){
        System.out.println("Invalid input");
        System.out.print("How many players? Enter a number from 2 to 4: ");
        playerNumber = in.nextInt();
    }
    
    //Board(int dimension, int playerCount, Token p1, Token p2, Token p3, Token p4){
    Board b1 = new Board(10, playerNumber, player1, player2, player3, player4);
    
    //Turn Variables
    int updatedSpace = 0;
    int roll = 0;
    in = new Scanner(System.in);
    
    //TURN 1
    //PLAYER 1:
    System.out.print("Player 1: Type 'ready' to roll dice ");
    String input = in.nextLine();
    while (!input.equalsIgnoreCase("ready")) {
        System.out.print("Player 1: Type 'ready' to roll dice ");
        input = in.nextLine();
    }
    roll = ((int) (6.0 * Math.random()) + 1);
    player1.setPosition(player1.getSpaceX(roll), player1.getSpaceY(roll));
    b1.printBoard();
    System.out.println("You rolled a " + roll);
    if(player1.chuteCheck() != 0){
        player1.setPosition( player1.getSpaceX( player1.chuteCheck() ), player1.getSpaceY( player1.chuteCheck() ) );
        b1.printBoard();
        System.out.println("You landed on a chute space!");
    } else if (player1.ladderCheck() != 0) {
        player1.setPosition( player1.getSpaceX( player1.ladderCheck() ), player1.getSpaceY( player1.ladderCheck() ) );
        b1.printBoard();
        System.out.println("You landed on a ladder space!");
    }
    System.out.println("You are on space: " + player1.getSpace());
    
    
    //PLAYER 2
    System.out.print("Player 2: Type 'ready' to roll dice ");
    input = in.nextLine();
    while (!input.equalsIgnoreCase("ready")) {
        System.out.print("Player 2: Type 'ready' to roll dice ");
        input = in.nextLine();
    }
    roll = ((int) (6.0 * Math.random()) + 1);
    player2.setPosition(player2.getSpaceX(roll), player2.getSpaceY(roll));
    b1.printBoard();
    System.out.println("You rolled a " + roll);
    if(player2.chuteCheck() != 0){
        player2.setPosition( player2.getSpaceX( player2.chuteCheck() ), player2.getSpaceY( player2.chuteCheck() ) );
        b1.printBoard();
        System.out.println("You landed on a chute space!");
    } else if (player2.ladderCheck() != 0) {
        player2.setPosition( player2.getSpaceX( player2.ladderCheck() ), player2.getSpaceY( player2.ladderCheck() ) );
        b1.printBoard();
        System.out.println("You landed on a ladder space!");
    }
    System.out.println("You are on space: " + player2.getSpace());
    
    if(b1.playerCount >= 3){
        //PLAYER 3
        System.out.print("Player 3: Type 'ready' to roll dice ");
        input = in.nextLine();
        while (!input.equalsIgnoreCase("ready")) {
            System.out.print("Player 3: Type 'ready' to roll dice ");
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
        if(b1.playerCount == 4){
            // PLAYER 4
            System.out.print("Player 4: Type 'ready' to roll dice ");
            input = in.nextLine();
            while (!input.equalsIgnoreCase("ready")) {
                System.out.print("Player 4: Type 'ready' to roll dice ");
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
    
    //SUBSEQUENT TURNS
    while(player1.getSpace() < 100 && player2.getSpace() < 100 && player3.getSpace() < 100 && player4.getSpace() < 100 ){
        //PLAYER 1
        System.out.print("Player 1: Type 'ready' to roll dice ");
        input = in.nextLine();
        while (!input.equalsIgnoreCase("ready")) {
            System.out.print("Player 1: Type 'ready' to roll dice ");
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
        if(player1.getSpace() == 100){
            System.out.print("Player 1 Wins!");
            break;
        }
        
        //PLAYER 2
        System.out.print("Player 2: Type 'ready' to roll dice ");
        input = in.nextLine();
        while (!input.equalsIgnoreCase("ready")) {
            System.out.print("Player 2: Type 'ready' to roll dice ");
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
        if(player2.getSpace() == 100){
            System.out.print("Player 2 Wins!");
            break;
        }
        
        //NESTED LOOP
        //PLAYER 3
        if(b1.playerCount >= 3){
            System.out.print("Player 3: Type 'ready' to roll dice ");
            input = in.nextLine();
            while (!input.equalsIgnoreCase("ready")) {
                System.out.print("Player 3: Type 'ready' to roll dice ");
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
                break;
            }
            
            //PLAYER 4
            if (b1.playerCount == 4) {
                System.out.print("Player 4: Type 'ready' to roll dice ");
                input = in.nextLine();
                while (!input.equalsIgnoreCase("ready")) {
                    System.out.print("Player 4: Type 'ready' to roll dice ");
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
                    break;
                }
            }
        }
    }
  }
}
