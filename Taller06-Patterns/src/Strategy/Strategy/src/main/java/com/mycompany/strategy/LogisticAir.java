/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author VICTOR
 */
public class LogisticAir implements LogisticStrategy{
    private  String name ="Air";
    @Override
    public String toString() {
        return "Logict{" + "name=" + name + '}';
    }
    @Override
    public int delivery() {
        System.out.println("Metodo de transporte"+ this.name);
        return 400;
    }
    
}
