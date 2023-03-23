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
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Aclaremos de una vez que el ejercicio de la latas no pide armar la piramide, solo decir si un numero es apilable o no y cual es el numero mas cercano para apilar
        System.out.println("Ingrese el numero de latas que desea apilar:");
        int can = input.nextInt();
        
        int sum = 3;
        int lastSum = 1;
        int i = 2;
        int numOfCans;
        
        if(can==1||can==3){
            System.out.println("Si es posible apilar "+can+" latas!, No es tan dificil vamos");
            System.exit(0);
        }
        if(can==2){
            System.out.println("No es posible apilar "+can+" latas, necesitas por lo menos "+(can+1)+" latas para ello");
            System.exit(0);
        }
        
        while(sum<can){
            i++;
            lastSum=sum;
            sum+=i;
        }
        
        if(can==sum){
            System.out.println("Si es posible apilar "+can+" latas!");
        }else if(can%lastSum <= sum%can){
            numOfCans = lastSum;
            System.out.println("No es posible apilar "+can+" latas, con "+numOfCans+" latas puedes armar una piramide");
        }else{
            numOfCans = sum;
            System.out.println("No es posible apilar "+can+" latas, necesitas por lo menos "+numOfCans+" latas para ello");
        }
    }
}
