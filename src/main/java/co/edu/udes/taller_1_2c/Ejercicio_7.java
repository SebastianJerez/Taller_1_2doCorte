/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller_1_2c;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector 1");
        int sizeOne = input.nextInt();
        int [] arrayOne = new int[sizeOne];
        
        System.out.println("Ingrese el tamaño del vector 2");
        int sizeTwo = input.nextInt();
        int [] arrayTwo = new int[sizeTwo];
        
        System.out.println("Ingrese los valores del vector 1");
        for(int i=0;i<sizeOne;i++){
            System.out.println("Ingrese un numero entero");
            arrayOne[i] = input.nextInt();
        }
        
        System.out.println("Ingrese los valores del vector 2");
        for(int i=0;i<sizeTwo;i++){
            System.out.println("Ingrese un numero entero");
            arrayTwo[i] = input.nextInt();
        }
        int [] arrayPlus = new int [sizeOne+sizeTwo];
        for(int i=0;i<(sizeOne+sizeTwo);i++){
            if(i<sizeOne){
                arrayPlus[i]=arrayOne[i];
            }else{
                arrayPlus[i]=arrayTwo[i-sizeOne];
            }
        }
        
        Arrays.sort(arrayPlus);
        
        System.out.println("Este es el nuevo vector:\nAscendente:");
        for(int i=0;i<arrayPlus.length;i++){
            System.out.print(arrayPlus[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Descendente:");
        for(int i=arrayPlus.length;i>0;i--){
            System.out.print(arrayPlus[i-1]+" ");
        }
    }
}
