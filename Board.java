public class Board{
  private int playerCount;
  private int dimension;
  private Token p1;
  private Token p2;
  private Token p3;
  private Token p4;

public Board(int dimension, int playerCount, Token p1, Token p2, Token p3, Token p4){
  this.dimension = dimension;
  this.playerCount = playerCount;
  this.p1 = p1;
  this.p2 = p2;
  this.p3 = p3;
  this.p4 = p4;
  int a = 0;
  switch (playerCount){
    case 1:
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
        } else {
          for(int j = 0; j <= dimension * 6; j++){
            if(p1.getPlayerX() == j && p1.getPlayerY() == i){
              System.out.printf("%c", p1.getInitial());
            } else if(j % 6 == 0){
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
        }
        System.out.print("\n");
      }
      break;
    case 2:
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
        } else {
          for(int j = 0; j <= dimension * 6; j++){
            if((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i)){
              if(p1.getPlayerX() == j && p1.getPlayerY() == i){
                System.out.printf("%c", p1.getInitial());
              } else {
                System.out.printf("%c", p2.getInitial());
              }
            } else if(j % 6 == 0){
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
        }
        System.out.print("\n");
      }
      break;
      
    case 3:
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
        } else {
          for(int j = 0; j <= dimension * 6; j++){
            if((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i) || (p3.getPlayerX() == j && p3.getPlayerY() == i)){
              if(p1.getPlayerX() == j && p1.getPlayerY() == i){
                System.out.printf("%c", p1.getInitial());
              } else if (p2.getPlayerX() == j && p2.getPlayerY() == i){
                System.out.printf("%c", p2.getInitial());
              } else {
                System.out.printf("%c", p3.getInitial());
              }
            } else if(j % 6 == 0){
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
        }
        System.out.print("\n");
      }
      break;

    case 4:
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
            if((p1.getPlayerX() == j && p1.getPlayerY() == i) || (p2.getPlayerX() == j && p2.getPlayerY() == i) || (p3.getPlayerX() == j && p3.getPlayerY() == i) || (p4.getPlayerX() == j && p4.getPlayerY() == i)){
              if(p1.getPlayerX() == j && p1.getPlayerY() == i){
                System.out.printf("%c", p1.getInitial());
              } else if (p2.getPlayerX() == j && p2.getPlayerY() == i){
                System.out.printf("%c", p2.getInitial());
              } else if (p3.getPlayerX() == j && p3.getPlayerY() == i){
                System.out.printf("%c", p3.getInitial());
              } else {
                System.out.printf("%c", p4.getInitial());
              }
            } else if(j % 6 == 0){
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
        }
        System.out.print("\n");
      }
      break;
}
}
/********************************
 *                              *
 *         Tester Class         *
 *                              *
 *******************************/
 
  public static void main(String[] args){
    //Token(char initialInput, String modelInput, int playerY, int playerX){
    Token player1 = new Token('a', "test", 2, 2);
    Token player2 = new Token('b', "test", 4, 2);
    Token player3 = new Token('c', "test", 2, 3);
    Token player4 = new Token('d', "test", 4, 3);

    //Board(int dimension, int playerCount, Token p1, Token p2, Token p3, Token p4){
    Board b1 = new Board(10, 4, player1, player2, player3, player4);
    System.out.print(b1);
  }
}
