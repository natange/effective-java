/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deff.effective_java.ch02;

/**
 *
 * @author cartson
 */
public class Color{
    int r;
    int g;
    int b;
    
    
    /**
     * Constructor
     */
    private Color(int r, int g, int b){
       this.r = r;
       this.g = g;
       this.b = b;
    }
    
    public static Color red() {return new Color(255, 0, 0); }
    
    @Override
    public String toString(){
        return String.format("Color={r=%d, g=%d, b=%d}", this.r, this.g, this.b);
    }
}