public class Board{


  
  public Board(){}
  
  public Board(int dimension){
    private int i = 0;
    private int j = 0;
    private int k = 0;
    while (i < dimension){
      while (j < 61){
        System.out.print("*");
        j++;
      }         
        System.out.print("\n");
        while (k < 23){
           if (k == 11){
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
    while (j < 61){
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
