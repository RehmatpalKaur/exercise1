/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rehma
 */
import java.util.Random;

public class CardTrick {
   

    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1); // 1 to 13 (inclusive) for card values
            card.setSuit(random.nextInt(4)); // Random suit index between 0 and 3

            hand[i] = card;
        }

        // Ask the user for their card
        System.out.println("Enter your card value (1-10 for numbers, 11 for Jack, 12 for Queen, 13 for King):");
        int userValue = scanner.nextInt();
        System.out.println("Enter your card suit (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades):");
        int userSuit = scanner.nextInt();

        // Search for the user's card in the hand
        boolean found = false;
        for (var card : hand) {
            if (card.getValue() == userValue && card.getSuit() == userSuit - 1) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo(); // Invoke the printInfo method if the guess is successful
        } else {
            System.out.println("Sorry, your card was not found in the hand.");
        }
        
        scanner.close();
    }

    /**
     * A simple method to print out personal information.
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!\n");
        System.out.println("My name is ChatGPT, and I'm here to assist you!\n");
        System.out.println("My career ambitions:");
        System.out.println("-- Assist users in solving problems");
        System.out.println("-- Continuously learn and improve\n");
        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Writing code");
        System.out.println("-- Engaging in conversations with users\n");
    }
}

