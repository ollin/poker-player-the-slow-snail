package org.leanpoker.player;

/**
 * Created by lukasgin on 26/08/2017.
 */
public class Card {

    public String rank; // Rank of the card. Possible values are numbers 2-10 and J,Q,K,A
    public String suit;  // Suit of the card. Possible values are: clubs,spades,hearts,diamonds

    public int getRank() {
        switch (rank){
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;

        }
        return 1;
    }
}
