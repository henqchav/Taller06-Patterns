/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strategy;

import java.util.Scanner;

/**
 *
 * @author VICTOR
 */
public class Strategy {

    public static void main(String[] args) {
        String conf= "";
        int precio=0;
        MetodoTransporte typeTransport = null;
        System.out.println("Tipos de transporte:" + "\n"
                + "1: Air"+"\n"
                + "2: Bike"+"\n"
                + "3: Car"+"\n"
                + "4: RailWay"+"\n"
                + "5: River"+"\n"
                );
        System.out.println("Ver precios del tipo de transporte");
        while( conf!="salir"){
            System.out.print("Escriba una opcion: ");
            Scanner sc = new Scanner(System.in);
            conf = sc.nextLine();
            if(conf=="1"){
                typeTransport = new MetodoTransporte( new LogisticAir());
            }if(conf=="2"){
                typeTransport = new MetodoTransporte( new LogisticBike());
            }if(conf=="3"){
                typeTransport = new MetodoTransporte( new LogisticCar());
            }if ( conf=="4"){
                typeTransport = new MetodoTransporte( new LogistcRailway());
            }if (conf =="5"){
                System.out.println("Si desea escoger dicha opcion escriba conf");
            }else{
                typeTransport = new MetodoTransporte( new LogisticCar());
            }
            System.out.println("El precio a cancelar es: "+ typeTransport.delivery());
        }
        System.out.println(typeTransport.delivery());
        
        
        
        
    }
}
