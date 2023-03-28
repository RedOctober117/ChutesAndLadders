public class Board{
  
  public Board(int dimension){
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < dimension){
      while (j < (6 * dimension) + 1){
        System.out.print("*");
        j++;
      }         
        System.out.print("\n");
        while (k < 23){
           if (k == dimension + 1){
             System.out.print("\n");
             k++;
          } else {
             System.out.print("*     ");
             k++;
          }
        }
        System.out.print("\n");
        j = 0;
        k = 0;
        i++;
      }
    while (j < (6 * dimension) + 1){
      System.out.print("*");
      j++;
    }
  }



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
