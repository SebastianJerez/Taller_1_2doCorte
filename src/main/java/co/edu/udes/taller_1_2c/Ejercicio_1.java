/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.taller_1_2c;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de segundos:");
        int seconds = input.nextInt();
        
        int minutes = seconds/60;
        seconds = seconds%60;
        int hours = minutes/60;
        String format = "AM";
        minutes = minutes%60;
        int days = hours/24;
        hours = hours%24;
        int hours12 = hours;
        if(hours>=12){
            format = "PM";
            hours12=(hours%13)+1;
        }
        if(hours12==0){
            hours12=12;
        }
        
        System.out.println("Este es el periodo en formato militar: "+days+" : "+hours+" : "+minutes+" : "+seconds);
        System.out.println("Este es el periodo normal: "+days+" : "+hours12+" "+format+" : "+minutes+" : "+seconds);
    }
}
