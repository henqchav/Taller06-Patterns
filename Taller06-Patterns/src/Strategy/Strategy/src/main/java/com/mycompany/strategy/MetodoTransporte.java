/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author VICTOR
 */
public class MetodoTransporte {
    private LogisticStrategy L_S;

    public MetodoTransporte(LogisticStrategy L_S) {
        this.L_S = L_S;
    }
    
    public int delivery(){
     return this.L_S.delivery();
    }
}
