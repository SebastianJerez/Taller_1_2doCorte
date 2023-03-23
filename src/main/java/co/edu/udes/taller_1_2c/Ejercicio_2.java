/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller_1_2c;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la fecha deseada");
        System.out.println("Dia: ");
        int day = input.nextInt();
        System.out.println("Mes: ");
        int month = input.nextInt();
        System.out.println("Año: ");
        int year = input.nextInt();
        
        if(day<0||month<0||year<0){
            System.out.println("La fecha ingresada es invalida");
            System.exit(0);
        }
        
        int daysPassed = 0;
        boolean isValid = false;
        
        switch(month){
            case 1:{
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 2:{
                daysPassed=31;
                if(day==29&&year%4==0){
                    isValid=true;
                }else if(day>0&&day<=28){
                    isValid=true;
                }
                break;
            }
            case 3:{
                daysPassed=59;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 4:{
                daysPassed=90;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 5:{
                daysPassed=120;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 6:{
                daysPassed=151;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 7:{
                daysPassed=181;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 8:{
                daysPassed=212;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 9:{
                daysPassed=243;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 10:{
                daysPassed=273;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 11:{
                daysPassed=304;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 12:{
                daysPassed=334;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            default:{
                break;
            }
        }
        
        if(isValid){
            System.out.println("La fecha ingresada es valida");
            daysPassed = daysPassed+day;
            System.out.println("Los dias que han transcurrido hasta ese dia son "+daysPassed+" dias");
        }else{
            System.out.println("La fecha ingresada es invalida");
        }
    }
}
