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
public class PokerGame  extends Game{
    private PokerTable pokerTable;
    private List<PokerHand> hands;
    private Double betSize;
    private PokerHand bigBlind;
    private PokerHand smallBlind;
    private Double minEntryBalance;
    private Double maxEntryBalance;
    private String endState;
    private int stage; // whether cards are dealt, how many have been opened in table etc.
    private PokerHand lastRaise;
    
    
    public void playerJoins(PokerHand h){}
    
    public void playerLeaves(PokerHand h){}
    
    public void gameBegins(){}
    
    public void nextStage(){}
    
    public PokerHand findWinner(){
        return null;
    }
    
    public void settlePot(){}
    
    public PokerGame newGame(){ // copies the details of current game into new 
        return null;
    }
    
}
