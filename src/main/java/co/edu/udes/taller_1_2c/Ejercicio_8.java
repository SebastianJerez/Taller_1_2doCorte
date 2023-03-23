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
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [][] matrix = new int [5][12];
        String [] nameSignature = new String [5];
        String [] months = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int [] sumSignatures = new int [5];
        int [] sumMonths = new int [12];
        int mostStudiedSignature;
        int leastStudiedSignature;
        int iMax, iMin;
        
        System.out.println("Matriz de horas de estudio mensuales por materia");
        
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el nombre de la materia "+(i+1)+": ");
            nameSignature[i] = input.nextLine();
        }
        
        for(int i=0;i<5;i++){
            sumSignatures[i] = 0;
            for(int j=0;j<12;j++){
                System.out.println("Ingrese las horas estudiadas de la materia "+nameSignature[i]+" en "+months[j]+": ");
                matrix[i][j] = input.nextInt();
                sumSignatures[i] += matrix[i][j];
            }
        }
        for(int j=0;j<12;j++){
            sumMonths[j]=0;
            for(int i=0;i<5;i++){
                sumMonths[j]+=matrix[i][j];
            }
        }
        
        mostStudiedSignature = sumSignatures[0];
        iMax = 0;
        for(int i=1;i<5;i++){
            if(sumSignatures[i]>mostStudiedSignature){
                mostStudiedSignature = sumSignatures[i];
                iMax = i;
            }
        }
        
        leastStudiedSignature = sumSignatures[0];
        iMin = 0;
        for(int i=1;i<5;i++){
            if(sumSignatures[i]<leastStudiedSignature){
                leastStudiedSignature = sumSignatures[i];
                iMin = i;
            }
        }
        
        System.out.println("\nEste es el total de horas anual de cada asignatura:");
        for(int i=0;i<5;i++){
            System.out.println(nameSignature[i]+": "+sumSignatures[i]);
        }
        System.out.println("\nEste es el total de horas mensual estudiadas:");
        for(int i=0;i<12;i++){
            System.out.println(months[i]+": "+sumMonths[i]);
        }
        System.out.println("\nLa materia con mas horas de estudio dedicadas fue: "+nameSignature[iMax]+", con un total de "+mostStudiedSignature+" horas");
        System.out.println("La materia con menos horas de estudio dedicadas fue: "+nameSignature[iMin]+", con un total de "+leastStudiedSignature+" horas");
        
    }
}
