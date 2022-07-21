/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author VICTOR
 */
public class LogistcRailway implements LogisticStrategy{

    @Override
    public String toString() {
        return "Logict{" + "name=" + name + '}';
    }

    
    private  String name ="Railway";
    
    @Override
    public int delivery() {
        System.out.println("Metodo de transporte"+ this.name);
        return 200;
    }
    
}
