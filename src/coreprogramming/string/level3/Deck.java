package coreprogramming.string.level3;
import java.util.*;

/*
 * Deck: Creates a standard 52-card deck with four suits and thirteen ranks,
 * implements shuffle functionality to randomize card order, and distributes
 * cards to multiple players. Supports game simulation and card dealing operations.
 */
public class Deck {
    // Create a standard deck of 52 playing cards (4 suits × 13 ranks)
    public static String[] initializeDeck(){
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length*ranks.length];
        int k=0;
        for(String suit: suits){
            for(String rank: ranks){
                deck[k++] = rank+" of "+suit;
            }
        }
        return deck;
    }

    // Shuffle deck using Fisher-Yates shuffling algorithm
    public static String[] shuffleDeck(String[] deck){
        int n = deck.length;
        for(int i=0;i<n;i++){
            int r = i + (int)(Math.random()*(n-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        return deck;
    }

    // Distribute cards from deck to multiple players
    public static String[][] distributeDeck(String[] deck,int players,int cards){
        if(players*cards>deck.length) return null;
        String[][] result = new String[players][cards];
        for(int i=0;i<players;i++){
            for(int j=0;j<cards;j++){
                result[i][j] = deck[i*cards+j];
            }
        }
        return result;
    }

    // Print each player's cards
    public static void printPlayersCards(String[][] players){
        for(int i=0;i<players.length;i++){
            System.out.println("Player "+(i+1)+": "+Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args){
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] players = distributeDeck(deck,4,5);
        printPlayersCards(players);
    }
}
