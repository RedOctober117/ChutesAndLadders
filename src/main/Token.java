/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rsdunn
 */
/**
 * Token will create player objects that are then passed to Board() to draw the Chutes and Ladders playspace.
 */
public class Token{
  private int playerX;
  private int playerY;
  private char initial;
  private String model;
  private int destination = 0;
  // These are not in use yet, but may be a solution for adding ascii art.
  public static final String MODEL1 = "Model 1";
  public static final String MODEL2 = "Model 2";
  public static final String MODEL3 = "Model 3";
  public static final String MODEL4 = "Model 4";
  /**
   * Default constructor for Token. Serves no purpose at this time.
   */
  public Token(){}
  /**
   * Token constructor for creating players.
   * @param initialInput stores the initial of the player.
   * @param modelInput stores the ascii art of the player.
   * @param playerX stores the x (j) coordinate of the player.
   * @param playerY stores the y (i) coordinate of the player.
   */
  public Token(char initialInput, String modelInput, int playerX, int playerY){
    this.initial = initialInput;
    this.playerX = playerX;
    // The below offsets the players y to circumvent an issue in Board that, frankly, I don't feel like fixing.
    this.playerY = playerY -1;
    // The below out-commented logic can serve to assign player ascii art.
    /*switch(modelInput){
      case 1:
        this.model = MODEL1;
        break;
      case 2:
        this.model = MODEL2;
        break;
      case 3:
        this.model = MODEL3;
        break;
      case 4:
        this.model = MODEL4;
        break;
      default:
        this.model = "";*/
    }
  /**
   * setPosition mutates the positional values of a player.
   * @param newX assigns new x (j).
   * @param newY assigns new y (i).
   */
  public void setPosition(int newX, int newY){
    this.playerX = newX;
    this.playerY = newY - 1;
  }
/**
 * Return a players x (j).
 * @return integer x (j) coord.
 */
  public int getPlayerX(){
    return this.playerX;
  }
/**
 * Return a players y (i).
 * @return integer y (i) coord.
 */
  public int getPlayerY(){
    return this.playerY;
  }
  public int getPlayerYActual(){
      int newValue = this.playerY+1;
      return newValue;
  }
/**
 * Return a players initial.
 * @return char of player.
 */
  public char getInitial(){
    return this.initial;
  }
public int getSpace(){
    /*
        Summary:
                The coordinates of the pieces increment by 6 on the x axis for 
                each space on the board, and 3 on the y axis.
                From the starting point of a token on the board, the scanner 
                travels to the right incrementing by one space at a time.
                If at any point the coordinates match, the loop is broken 
                and the number of spaces is returned.
                
                ****Note: playerY = playerY-1    (as seen on line 40)
    */
    
    /*
        instance variables
    */
    int coordinateSeekerX;
    int coordinateSeekerY;
    int coordinateSeekerSpace = 1;
    /*
        there are 4 cases present: player1's character, player2's character, player3's character, or player4's character.
        the if statements check to see which player's space is requested.
    */
    if ('1' == this.initial){
        /*
            these are the default coordinates of player 1.
        */
        coordinateSeekerX=2;
        coordinateSeekerY=28;
        /*
            the program scans the board 2 rows at a time.
            this means that the 10x10 board will be scanned 5 times. 
        */
        for(int h = 0; h < 5; h++){
            /*
                From the point (2,28), the scanner travels to the right 
                incrementing by one space at a time.
                If at any point the coordinates match, the loop is broken 
                and the number of spaces is returned.
            */
            for(int i = 0; i < 9; i++){
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    coordinateSeekerX=coordinateSeekerX+6;
                    coordinateSeekerSpace++;
                }
            }
            
            /*
                Once the scanner has traveled 9 times, it has reached the end 
                of the board.
                It does a final check to see if the last space in the row
                matches the coordinates of the token.
                If the coordinates do not match, the scanner moves 3 on 
                the y axis to the next space.
            */
            if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                break;
            } else {
                coordinateSeekerY=coordinateSeekerY - 3;
                coordinateSeekerSpace++;
                /*
                    If the coordinates match, break the loop.
                    Otherwise, travel along the x axis opposite from the 
                    previous row while searching for matching coordinates.
                    Increments are -6 for each space.
                */
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    for(int i = 0; i < 9; i++){
                        if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                            break;
                        } else {
                            coordinateSeekerX=coordinateSeekerX-6;
                            coordinateSeekerSpace++;
                        }
                    }
                    /*
                        After searching the second row for matching coordinates, 
                        the scanner jumps up a space and the loop starts again
                    */
                    if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                        break;
                    } else {
                        coordinateSeekerY=coordinateSeekerY - 3;
                        coordinateSeekerSpace++;
                    }
                }
            }
        }
    } else if ('2' == this.initial){
        /*
            these are the default coordinates of player 2.
        */
        coordinateSeekerX=4;
        coordinateSeekerY=28;
        for(int h = 0; h < 5; h++){
            for(int i = 0; i < 9; i++){
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    coordinateSeekerX=coordinateSeekerX+6;
                    coordinateSeekerSpace++;
                }
            }
            if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                break;
            } else {
                coordinateSeekerY=coordinateSeekerY - 3;
                coordinateSeekerSpace++;
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    for(int i = 0; i < 9; i++){
                        if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                            break;
                        } else {
                            coordinateSeekerX=coordinateSeekerX-6;
                            coordinateSeekerSpace++;
                        }
                    }
                    if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                        break;
                    } else {
                        coordinateSeekerY=coordinateSeekerY - 3;
                        coordinateSeekerSpace++;
                    }
                }
            }
        }
    } else if ('3' == this.initial){
        /*
            these are the default coordinates of player 3.
        */
        coordinateSeekerX=2;
        coordinateSeekerY=29;
        for(int h = 0; h < 5; h++){
            for(int i = 0; i < 9; i++){
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    coordinateSeekerX=coordinateSeekerX+6;
                    coordinateSeekerSpace++;
                }
            }
            if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                break;
            } else {
                coordinateSeekerY=coordinateSeekerY - 3;
                coordinateSeekerSpace++;
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    for(int i = 0; i < 9; i++){
                        if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                            break;
                        } else {
                            coordinateSeekerX=coordinateSeekerX-6;
                            coordinateSeekerSpace++;
                        }
                    }
                    if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                        break;
                    } else {
                        coordinateSeekerY=coordinateSeekerY - 3;
                        coordinateSeekerSpace++;
                    }
                }
            }
        }
    } else if ('4' == this.initial){
        /*
            these are the default coordinates of player 4.
        */
        coordinateSeekerX=4;
        coordinateSeekerY=29;
        for(int h = 0; h < 5; h++){
            for(int i = 0; i < 9; i++){
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    coordinateSeekerX=coordinateSeekerX+6;
                    coordinateSeekerSpace++;
                }
            }
            if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                break;
            } else {
                coordinateSeekerY=coordinateSeekerY - 3;
                coordinateSeekerSpace++;
                if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                    break;
                } else {
                    for(int i = 0; i < 9; i++){
                        if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                            break;
                        } else {
                            coordinateSeekerX=coordinateSeekerX-6;
                            coordinateSeekerSpace++;
                        }
                    }
                    if(this.getPlayerX() == coordinateSeekerX && this.getPlayerY() == coordinateSeekerY){
                        break;
                    } else {
                        coordinateSeekerY=coordinateSeekerY - 3;
                        coordinateSeekerSpace++;
                    }
                }
            }
        }
    }
    if(coordinateSeekerSpace > 100 || coordinateSeekerSpace < 0){
        coordinateSeekerSpace = 0;
    }
    return coordinateSeekerSpace;
}
// Returns the i of a space on the board for a specific player
public int getSpaceX(int space){
    int iValue = 0;
    if ('1' == this.initial || '3' == this.initial){
        if (space <= 10){
            iValue = 2 + 6 * (space - 1);
        } else if (space <= 20){
            iValue = 56 - 6 * (space - 11);
        } else if (space <= 30){
            iValue = 2 + 6 * (space - 21);
        } else if (space <= 40){
            iValue = 56 - 6 * (space - 31);
        } else if (space <= 50){
            iValue = 2 + 6 * (space - 41);
        } else if (space <= 60){
            iValue = 56 - 6 * (space-51);
        } else if (space <= 70){
            iValue = 2 + 6 * (space - 61);
        } else if (space <= 80){
            iValue = 56 - 6 * (space-71);
        } else if (space <= 90){
            iValue = 2 + 6 * (space - 81);
        } else if (space <= 100){
            iValue = 56 - 6 * (space - 91);
        } else {
            iValue = 2;
        }
    } else if ('2' == this.initial || '4' == this.initial){
        if (space <= 10){
            iValue = 4 + 6 * (space - 1);
        } else if (space <= 20){
            iValue = 58 - 6 * (space - 11);
        } else if (space <= 30){
            iValue = 4 + 6 * (space - 21);
        } else if (space <= 40){
            iValue = 58 - 6 * (space - 31);
        } else if (space <= 50){
            iValue = 4 + 6 * (space - 41);
        } else if (space <= 60){
            iValue = 58 - 6 * (space - 51);
        } else if (space <= 70){
            iValue = 4 + 6 * (space - 61);
        } else if (space <= 80){
            iValue = 58 - 6 * (space-71);
        } else if (space <= 90){
            iValue = 4 + 6 * (space - 81);
        } else if (space <= 100){
            iValue = 58 - 6 * (space - 91);
        } else {
            iValue = 4;
        }
    }
    return iValue;
}


// Returns the j of a space on the board for a specific player
public int getSpaceY(int space){
    int jValue = 0;
    if('1' == this.initial || '2' == this.initial){
        if (space <= 10){
            jValue = 29;
        } else if (space <= 20){
            jValue = 26;
        } else if (space <= 30){
            jValue = 23;
        } else if (space <= 40){
            jValue = 20;
        } else if (space <= 50){
            jValue = 17;
        } else if (space <= 60){
            jValue = 14;
        } else if (space <= 70){
            jValue = 11;
        } else if (space <= 80){
            jValue = 8;
        } else if (space <= 90){
            jValue = 5;
        } else if (space <= 100){
            jValue = 2;
        } else {
            jValue = 2;
        }
    } else if ('3' == this.initial || '4' == this.initial){
        if (space <= 10){
            jValue = 30;
        } else if (space <= 20){
            jValue = 27;
        } else if (space <= 30){
            jValue = 24;
        } else if (space <= 40){
            jValue = 21;
        } else if (space <= 50){
            jValue = 18;
        } else if (space <= 60){
            jValue = 15;
        } else if (space <= 70){
            jValue = 12;
        } else if (space <= 80){
            jValue = 9;
        } else if (space <= 90){
            jValue = 6;
        } else if (space <= 100){
            jValue = 3;
        } else {
            jValue = 3;
        }
    }
    return jValue;
}

public int chuteCheck(){
    destination = 0;
    if(this.getSpace() == 16){
        destination = 6;
    } else if (this.getSpace() == 47) {
        destination = 26;
    } else if (this.getSpace() == 49) {
        destination = 11;
    } else if (this.getSpace() == 56) {
        destination = 53;
    } else if (this.getSpace() == 62) {
        destination = 19;
    } else if (this.getSpace() == 64) {
        destination = 60;
    } else if (this.getSpace() == 87) {
        destination = 24;
    } else if (this.getSpace() ==93) {
        destination = 73;
    } else if (this.getSpace() == 95) {
        destination = 75;
    } else if (this.getSpace() == 98) {
        destination = 78;
    }
    return destination;
}

public int ladderCheck(){
    destination = 0;
    if(this.getSpace() == 1){
        destination = 38;
    } else if (this.getSpace() == 4) {
        destination = 14;
    } else if (this.getSpace() == 9) {
        destination = 31;
    } else if (this.getSpace() == 21) {
        destination = 42;
    } else if (this.getSpace() == 28) {
        destination = 84;
    } else if (this.getSpace() == 36) {
        destination = 44;
    } else if (this.getSpace() == 51) {
        destination = 67;
    } else if (this.getSpace() ==71) {
        destination = 91;
    } else if (this.getSpace() == 80) {
        destination = 100;
    }
    return destination;
}
}
