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
public class PokerHand {
    
    private Player player;
    private List<CardElement> cards;
    private Double balance;
    private boolean playing;
    private Double betAmount;
    
    public void fold(){}
    
    public void bet(Double d){}
    
    public void raise(Double d){}
    
    public void allIn(){}
}
