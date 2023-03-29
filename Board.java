public class Board{
  public static final char BORDER = '*';
  private int playerCount;
  private int dimension;

  public Board(int dimension){
    this.dimension = dimension;
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
    Board b1 = new Board(10);
    System.out.print(b1);
  }
}
