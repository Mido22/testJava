/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sigfig.game;

import com.sigfig.game.objects.*;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author mido
 */
public class ApplicationManager {
    private HashMap<Long,BlackJackGame> blackjacks;
    private HashMap<Long,PokerGame> pokers;
    private HashMap<Long,Player> players;
    private HashMap<Long,Dealer> deakers;
    private HashMap<Long,Table> tables;
    private Long blackJackCounter;
    private Long playerCounter;
    private Long pokerCounter;
    private Long dealerCounter;
    private Long tableCounter;
    
    
    public void startBlackJackGame(){}
    
    public void startPokerGame(Long tableId, Long dealerId, List<PokerHand> hands){} // if conditions are met, new poker game is created and added to 'pokers'.
    public void startBlackJackGame(Long tableId, Long dealerId, List<BlackJackHand> hands){} // if conditions are met, new poker game is created and added to 'blackjacks'.
    
    public void pokerBet(PokerGame pg, PokerHand ph){}
    public void pokerRaise(PokerGame pg, PokerHand ph, Double raise){}
    // Other such methods relating to player actions of poker game and BlackJack game are added.
    
    public void startApp(){}
    
    public void shutdown(){}
    
}
