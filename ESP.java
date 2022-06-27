import java.util.Random;
import java.util.Scanner;

public class ESP {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        /// Counter for loop iteration
        int counter = 0;

        /// Arrays of colors
        String[] colors = { "Red", "Green", "Blue", "Orange", "Yellow" };

        int guesses = 0;

        for (int i = 0; i < colors.length; i++) {
            Random random = new Random(); /// Random class to choose numbers
            int rnd = random.nextInt(colors.length);
            String computerSelection = colors[rnd];

            /// User input
            System.out.print("Guess a color between (Red, Green, Blue, Orange, Yellow): ");
            String word = keyboard.nextLine();

            System.out.println("Selected color is: " + computerSelection);

            /// comparing the user word with computer selection
            if (word.equalsIgnoreCase(computerSelection)) {
                guesses++;
            }

            /// counter increment
            counter++;

            /// break counter when its more than 10
            if (counter >= 10) {
                break;
            }
        }

        System.out.println("Guess count: " + guesses);

        keyboard.close();
    }

}
