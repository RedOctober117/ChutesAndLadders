public class Board{
  private int playerCount;
  private int dimension;

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
