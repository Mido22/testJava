/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sigfig.game.objects;

/**
 *
 * @author mido
 */
public class Card {
    
    private String Colour;
    private String Symbol;
    private String imageUrl;
    private Long number;

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }
    
    
    
}
