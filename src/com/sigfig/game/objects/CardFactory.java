/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigfig.game.objects;

import java.util.HashMap;

/**
 *
 * @author mido
 */
public class CardFactory {

    private static HashMap<Long, Card> cardPool; // This would store all the cards objects, they must not be explicitly created anywhere else.

    static {
        // Initialization block
        cardPool = new HashMap<Long, Card>();
        String[] symbols = {"Black-Clover", "Red-Hearts", "Black-Spade", "Red-Diamond"};
        long i = 0;
        Card c;
        for (String s : symbols) {
            do {
                i++;
                c = new Card();
                c.setNumber(i % 13);
                c.setColour(s.split("-")[0]);
                c.setSymbol(s.split("-")[1]);
                cardPool.put(i, c);
            } while (i % 13 != 0);
        }
    }

    public static Deck makeDeck() { //creates and returns a random deck
        return null;
    }

    public static Card getRandomCard() {// returns a random card
        return null;
    }
}
