/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioquestaoquinze;

/**
 *
 * @author Jairo
 * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200
 */

import java.util.Scanner;

public class Exercicioquestaoquinze {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um valor:");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("Número esta no intervalo");   
        }else{
            System.out.println("Número não esta no intervalo");
        }
    }
    
}
