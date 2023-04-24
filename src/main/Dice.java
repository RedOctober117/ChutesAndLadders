/**
 * This class represents a simple dice-rolling program, implemented using the Processing
 * library. The program displays a square that simulates a rolling dice, and animates the
 * dice until a random value is generated. Once a value is generated, the program displays
 * the value on the screen and stops animating the dice.
 *
 * This class extends the PApplet class, which is a Processing class that provides the
 * main window and event loop for the program.
 */
import processing.core.*;
import java.util.Random;

public class Dice extends PApplet {

    // Private fields
    private PGraphics g2;
    private int diceValue = 1;
    private int cycleCount = 0;
    private Random rand = new Random();

    /**
     * This method sets the size of the window to 200x200.
     */
    public void settings() {
        size(200, 200);
    }

    /**
     * This method is called once at the beginning of the program, and is used to initialize
     * any necessary state. In this case, it sets the text alignment and size, and creates
     * a PGraphics object to use for double-buffering.
     */
    public void setup() {
        textAlign(CENTER);
        textSize(32);
        g2 = createGraphics(width, height);
    }

    /**
     * This method is called every frame, and is used to draw the dice and animate it until
     * a random value is generated. Once a value is generated, the program displays the
     * value on the screen and stops animating the dice.
     */
    public void draw() {
        // Only draw if the PGraphics object has been initialized
        if (g2 != null) {
            // Set the frame rate and background color
            frameRate(30);
            background(255);

            // Draw the square representing the dice
            fill(0);
            rect(50, 50, 100, 100);
            fill(255);

            // Draw the circles representing the dots on the dice, based on the current
            // value of the dice
            switch (diceValue) {
                case 1:
                    ellipse(100, 100, 20, 20);
                    break;
                case 2:
                    ellipse(75, 75, 20, 20);
                    ellipse(125, 125, 20, 20);
                    break;
                case 3:
                    ellipse(75, 75, 20, 20);
                    ellipse(100, 100, 20, 20);
                    ellipse(125, 125, 20, 20);
                    break;
                case 4:
                    ellipse(75, 75, 20, 20);
                    ellipse(125, 75, 20, 20);
                    ellipse(75, 125, 20, 20);
                    ellipse(125, 125, 20, 20);
                    break;
                case 5:
                    ellipse(75, 75, 20, 20);
                    ellipse(125, 75, 20, 20);
                    ellipse(100, 100, 20, 20);
                    ellipse(75, 125, 20, 20);
                    ellipse(125, 125, 20, 20);
                    break;
                case 6:
                ellipse(75, 75, 20, 20);
                ellipse(125, 75, 20, 20);
                ellipse(75, 100, 20, 20);
                ellipse(125, 100, 20, 20);
                ellipse(75, 125, 20, 20);
                ellipse(125, 125, 20, 20);
                break;
            }

            // Roll the dice randomly for a maximum of 6 cycles
            if (cycleCount < 6) {
                if (frameCount % 10 == 0) {
                    diceValue = rand.nextInt(6) + 1;
                    cycleCount++;
                }
            } else {
                // Display the final dice value and stop the animation
                textSize(20);
                fill(0);
                text("Your Roll: " + diceValue, width / 2, height / 5);
                noLoop();
            }
        }
    }

    // Getter method for retrieving the current dice value
    public int getDiceValue() {
        return diceValue;
    }

    // The main method that starts the program
    public static void main(String[] args) {
        PApplet.main("Dice");
    }
}
