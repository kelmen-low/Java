import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialize Scanner and Random packages
        Scanner scnr = new Scanner(System.in);
        Random random = new Random();

        // Initialize card variables
        int cardTotal = 0;
        int firstCard = random.nextInt(1,10);
        int secondCard = random.nextInt(1,10);
        int dealerFirstCard = random.nextInt(1,10);
        int dealerSecondCard = random.nextInt(1,10);

        // Show the dealer's card one face up and one face down
        System.out.println("Hello and welcome to Blackjack!");
        System.out.println("The Dealer's cards: " + dealerFirstCard + " & *");

        // Show player both of their cards
        System.out.println("Your first two cards are: " + firstCard + " & " + secondCard);

        // Get the sum of the first hand
        cardTotal = firstCard + secondCard;

        // Display the sum of the first hand
        System.out.println("Total: " + cardTotal);

        // while the sum is less than 21, query for a new card
        while (cardTotal < 21) {
            System.out.println("Do you want another card? (y/n)?: ");
            String hitQ = scnr.next();

            // if a new card is requested, pull a random digit 1-10 and add it to the total
            // if stay is requested, print "stay"
            // if nonsense is provided, print a warning message
            if (hitQ.equals("y")) {
                int newCard = random.nextInt(1, 10);
                System.out.println("Card: " + newCard);
                cardTotal += newCard;
                System.out.println("Total: " + cardTotal);
            } else if (hitQ.equals("n")) {
                System.out.println("You stay.");
                break;
            } else {
                System.out.println("Please provide a valid input.");
            }
        }

        // if the card total is over 21, the player busts
        // print the final total, if player does not bust
        if (cardTotal > 21) {
            System.out.println("Busted!");
        } else {
            System.out.println("Your final total is: " + cardTotal);
        }

        // the dealer plays

        System.out.println("The dealer reveals both cards");
        System.out.println("The Dealer's cards: " + dealerFirstCard + " & " + dealerSecondCard);

        int sumDealerCards = dealerFirstCard + dealerSecondCard;

        while (sumDealerCards < 21) {
            System.out.println("Type any letter and hit ENTER to continue...");
            scnr.next();

            // if dealer has a sum less than 16, draw a card
            // if is over 16, stay
            if (sumDealerCards < 16) {
                int newCardDealer = random.nextInt(1, 10);
                System.out.println("The dealer pulled a: " + newCardDealer);
                sumDealerCards += newCardDealer;
                System.out.println("Dealer's Total: " + sumDealerCards);
            } else {
                System.out.println("The dealer decides to stay.");
                break;
            }
        }

        // if the card total is over 21, the player busts
        // print the final total, if player does not bust
        if (sumDealerCards > 21) {
            System.out.println("The dealer has busted!");
        } else {
            System.out.println("Dealer's final total: " + sumDealerCards);
        }

        System.out.println("Your final total: " + cardTotal);
        System.out.println();

        // determine who wins, loses or is tied
        if (cardTotal > 21 && sumDealerCards > 21) {
            System.out.println("It's a tie, you both busted!");
        } else if (cardTotal > 21) {
            System.out.println("You LOST since you busted!");
        } else if (sumDealerCards > 21) {
            System.out.println("You WON since the dealer busted!");
        } else {
            if (cardTotal > sumDealerCards) {
                System.out.println("You WON since your sum is higher!");
            } else if (cardTotal == sumDealerCards) {
                System.out.println("Its a TIE since both yours' and dealer's sums are the same!");
            }else {
                System.out.println("You LOST since the dealer's sum is higher!");
            }
        }

        System.out.println("GAME OVER!!! Thanks for playing");
    }
}