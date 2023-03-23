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
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String phrase = input.nextLine();
        
        int words = 0;
        int letters = 0;
        
        for(int i = 0;i<phrase.length();i++){
            if(phrase.charAt(i)==32){
                words++;
            }
        }
        words++;
        
        System.out.println("La frase tiene "+words+" palabras. A continuacion se muestra el numero de letras que tiene cada palabra en orden");
        
        for(int i = 0;i<phrase.length();i++){
            if(phrase.charAt(i)==32){
                System.out.print(letters+" ");
                letters=0;
                continue;
            }
            letters++;            
        }
        System.out.print(letters);
    }
}
