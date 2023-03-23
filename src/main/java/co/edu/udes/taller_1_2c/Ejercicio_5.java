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
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String way;
        
        System.out.println("Ingrese la base del triangulo rectangulo");
        int base = input.nextInt();
        
        System.out.println("En que direccion debe ir el triangulo? (Escriba 'A' para ascendente y 'D' para descendente)");
        do{
            way = input.next();
            way = way.toUpperCase();
            if(!way.equals("A")&&!way.equals("D")){
                System.out.println("Valor invalido, ingrese de nuevo la direccion");
            }
        }while(!way.equals("A")&&!way.equals("D"));
        
        if(way.equals("D")){
            for(int i=1;i<=base;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        if(way.equals("A")){
            for(int i=1;i<=base;i++){
                for(int k=1;k<=base-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
