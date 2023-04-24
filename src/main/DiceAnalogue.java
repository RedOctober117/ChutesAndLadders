// David

import java.util.Random;

/**
 *
 * @author ddeolloqui
 */
public class DiceAnalogue {

    /**
     * Method to return ascii art
     * @param roll integer roll to choose art
     */
      public static void printRoll(int roll){
        if (roll == 1) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "|     |" + "\n" + "|  O  |" + "\n" + "|     |" + "\n" + " -----");
            System.out.println("One");
        }
        if (roll == 2) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O   |" + "\n" + "|     |" + "\n" + "|   O |" + "\n" + " -----");
            System.out.println("Two");
        }
        if (roll == 3) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "|O    |" + "\n" + "|  O  |" + "\n" + "|    O|" + "\n" + " -----");
            System.out.println("Three");
        }
        if (roll == 4) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O O |" + "\n" + "|     |" + "\n" + "| O O |" + "\n" + " -----");
            System.out.println("Four");
        }
        if (roll == 5) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O O |" + "\n" + "|  O  |" + "\n" + "| O O |" + "\n" + " -----");
            System.out.println("Five");
        }
        if (roll == 6) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O O |" + "\n" + "| O O |" + "\n" + "| O O |" + "\n" + " -----");
            System.out.println("Six");
        }
    }
}
