/**
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
    this.playerY = playerY - 1;
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
}