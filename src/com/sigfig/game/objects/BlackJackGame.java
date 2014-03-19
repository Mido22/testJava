/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sigfig.game.objects;

import java.util.List;

/**
 *
 * @author mido
 */
public class BlackJackGame extends Game{
    
    private BlackJackHouse house;
    private List<BlackJackHand> hands;
    private Double minEntryBalance;
    private Double maxEntryBalance;
    private String state;
    private int stage; // whether cards are dealt, how many have been opened in table etc.
    
    
    public void playerJoins(BlackJackHand h){}
    
    public void playerLeaves(BlackJackHand h){}
    
    public void gameBegins(){}
    
    public void settle(){}
    
    public BlackJackGame newGame(){ // copies the details of current game into new 
        return null;
    }
}
