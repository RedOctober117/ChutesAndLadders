
public class Token{
  private int x;
  private int y;
  private char initial;
  private String model;

  public static final String MODEL1 = "Model 1";
  public static final String MODEL2 = "Model 2";
  public static final String MODEL3 = "Model 3";
  public static final String MODEL4 = "Model 4";

  public Token(){}

  public Token(char initialInput, int modelInput){
    this.initial = initialInput;
    switch(modelInput){
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
        this.model = "";
    }
  }

  public void setPosition(int newX, int newY){
    this.x = newX;
    this.y = newY;
  }
}
