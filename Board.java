public class Board{
  public static final char BORDER = '*';
  private int playerCount;
  private int dimension;

/*  public Board(int dimension, char initial, int playerX, int playerY){
    this.dimension = dimension;
    for (int k = 0; k < dimension; k++){
      for (int j = 0; j < (6 * dimension) + 1; j++){
        System.out.print("*");
      }         
        System.out.print("\n");
        for (int k = 0; k < 61; k++){
           if (k == 60){
             System.out.print("*\n");
          } else {
            if(playerX == j && playerY = i)
             System.out.printf(initial); 
          }
        }
        System.out.print("*\n");
      }
    for (int j = 0; j < (6 * dimension) + 1; j++){
      System.out.print("*");
    }
  }
*/
public Board(int dimension, char initial, int playerX, int playerY){
  this.dimension = dimension;
  int a = 0;
  while (a <= dimension * 6){
    System.out.print("*");
    a++;
  }
  System.out.print("\n");
  for (int i = 1; i < 31 ; i++){
    if(i % 3 == 0){
      for(int b = 0; b <= dimension * 6; b++){
        System.out.print("*");
      }
      //System.out.print("\n");
    } else {
      for(int j = 0; j <= dimension * 6; j++){
        if(playerX == i && playerY == j){
          System.out.printf("%c", initial);
        } else if(j % 6 == 0){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
    }
        System.out.print("\n");
  }
}
/*
  public Board(int dimension, int playerCount){
    this.dimension = dimension;
    this.playerCount = playerCount;
    for (int i = 0; i < dimension; i++){
      for (int j = 0; j < (6 * dimension) + 1; j++){
        System.out.print("*");
      }         
        System.out.print("\n");
        for (int k = 0; k < 23; k++){
           if (k == dimension + 1){
             System.out.print("\n");
          } else {
             System.out.print("*     ");
          }
        }
        System.out.print("\n");
      }
    for (int j = 0; j < (6 * dimension) + 1; j++){
      System.out.print("*");
    }
  }
*/



/********************************
 *                              *
 *         Tester Class         *
 *                              *
 *******************************/
 
  public static void main(String[] args){
    Board b1 = new Board(10, 'a', 10, 20);
    System.out.print(b1);
  }
}
