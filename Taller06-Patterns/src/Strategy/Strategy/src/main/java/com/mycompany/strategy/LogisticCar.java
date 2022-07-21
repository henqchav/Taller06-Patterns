/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author VICTOR
 */
public class LogisticCar implements LogisticStrategy{

    private  String name ="Car";
    
    @Override
    public String toString() {
        return "Logict{" + "name=" + name + '}';
    }
    
    @Override
    public int delivery() {
        System.out.println("Metdo de transporte"+ this.name);
        return 500;
    }
    
}
