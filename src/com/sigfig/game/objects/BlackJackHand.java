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
public class BlackJackHand{
    
    private Player player;
    private List<CardElement> cards;
    private List<CardElement> secondSet; // needed when player decides to split
    private Double balance;
    private boolean playing;
    private Double betAmount;
    
    public void hit(){}
    
    public void stand(){}
    
    public void doubleDown(){}
    
    public void split(){}
    
    public void surrender(){}
    
    
}
