/*
 * Token will create player objects that are then passed to Board() to draw the Chutes and Ladders playspace.
 */
public class Token{
  private int playerX;
  private int playerY;
  private char initial;
  private String model;
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
    if ('a' == this.initial){
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
    } else if ('b' == this.initial){
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
    } else if ('c' == this.initial){
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
    } else if ('d' == this.initial){
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
    return coordinateSeekerSpace;
}

// Returns the play space of a player based upon their j
public int getSpaceX(int space){
    if ('a' == this.initial || 'c' == this.initial){
        if (space <= 10){
            return 2 + 6 * (space - 1);
        } else if (space <= 20){
            return 56 - 6 * (space - 11);
        } else if (space <= 30){
            return 2 + 6 * (space - 21);
        } else if (space <= 40){
            return 56 - 6 * (space - 31);
        } else if (space <= 50){
            return 2 + 6 * (space - 41);
        } else if (space <= 60){
            return 56 - 6 * (space-51);
        } else if (space <= 70){
            return 2 + 6 * (space - 61);
        } else if (space <= 80){
            return 56 - 6 * (space-71);
        } else if (space <= 90){
            return 2 + 6 * (space - 81);
        } else if (space <= 100){
            return 56 - 6 * (space - 91);
        }
    } else if ('b' == this.initial || 'd' == this.initial){
        if (space <= 10){
            return 4 + 6 * (space - 1);
        } else if (space <= 20){
            return 58 - 6 * (space - 11);
        } else if (space <= 30){
            return 4 + 6 * (space - 21);
        } else if (space <= 40){
            return 58 - 6 * (space - 31);
        } else if (space <= 50){
            return 4 + 6 * (space - 41);
        } else if (space <= 60){
            return 58 - 6 * (space - 51);
        } else if (space <= 70){
            return 4 + 6 * (space - 61);
        } else if (space <= 80){
            return 58 - 6 * (space-71);
        } else if (space <= 90){
            return 4 + 6 * (space - 81);
        } else if (space <= 100){
            return 58 - 6 * (space - 91);
        }
    }
}


// Returns the play space of a player based on their i
public int getSpaceY(int space){
    if('a' == this.initial || 'b' == this.initial){
        if (space <= 10){
            return 29;
        } else if (space <= 20){
            return 26;
        } else if (space <= 30){
            return 23;
        } else if (space <= 40){
            return 20;
        } else if (space <= 50){
            return 17;
        } else if (space <= 60){
            return 14;
        } else if (space <= 70){
            return 11;
        } else if (space <= 80){
            return 8;
        } else if (space <= 90){
            return 5;
        } else if (space <= 100){
            return 2;
        }
    } else if ('c' == this.initial || 'd' == this.initial){
        if (space <= 10){
            return 30;
        } else if (space <= 20){
            return 27;
        } else if (space <= 30){
            return 24;
        } else if (space <= 40){
            return 21;
        } else if (space <= 50){
            return 18;
        } else if (space <= 60){
            return 15;
        } else if (space <= 70){
            return 12;
        } else if (space <= 80){
            return 9;
        } else if (space <= 90){
            return 6;
        } else if (space <= 100){
            return 3;
        }
    }
}
}
