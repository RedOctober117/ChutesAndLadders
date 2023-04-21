// David

import java.util.Random;

/**
 *
 * @author ddeolloqui
 */
public class DiceAnalogue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int int_random = rand.nextInt(5) + 1;
        if (int_random == 1) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "|     |" + "\n" + "|  O  |" + "\n" + "|     |" + "\n" + " -----");
            System.out.println("One");
        }
        if (int_random == 2) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O   |" + "\n" + "|     |" + "\n" + "|   O |" + "\n" + " -----");
            System.out.println("Two");
        }
        if (int_random == 3) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "|O    |" + "\n" + "|  O  |" + "\n" + "|    O|" + "\n" + " -----");
            System.out.println("Three");
        }
        if (int_random == 4) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O O |" + "\n" + "|     |" + "\n" + "| O O |" + "\n" + " -----");
            System.out.println("Four");
        }
        if (int_random == 5) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O O |" + "\n" + "|  O  |" + "\n" + "| O O |" + "\n" + " -----");
            System.out.println("Five");
        }
        if (int_random == 6) {
            System.out.println("Your number is: ");
            System.out.println(" -----" + "\n" + "| O O |" + "\n" + "| O O |" + "\n" + "| O O |" + "\n" + " -----");
            System.out.println("Six");
        }

    }

}
