public class Board{
  public static void main(String[] args){
    // Print top boundary
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < 10){
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
}
