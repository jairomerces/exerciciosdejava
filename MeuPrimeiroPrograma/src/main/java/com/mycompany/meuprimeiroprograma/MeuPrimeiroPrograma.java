/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.meuprimeiroprograma;

/**
 *
 * @author Jairo
 */
import java.util.Scanner;


public class MeuPrimeiroPrograma {
    
        
    public static void main(String[] args) {
            
        Scanner leitor = new Scanner(System.in);
        double nota1;
        double nota2; 
        double nota3; 
        double nota4;
        double media;
        double pesoAv1 = 1.5;
        double pesoAv2 = 1.5;
        double pesoAv3 = 4.0;
        double pesoAv4 = 3.00;
        
            System.out.println("Insira uma Nota1:");
            nota1 = leitor.nextDouble();
            System.out.println("Insira uma Nota2:");
            nota2 = leitor.nextDouble();
            System.out.println("Insira uma Nota3:");
            nota3 = leitor.nextDouble();
            System.out.println("Insira uma Nota4:");
            nota4 = leitor.nextDouble();
            
            media = (nota1 * pesoAv1)+(nota2 * pesoAv2)+(nota3 * pesoAv3)+(nota4 * pesoAv4)/10;
            
            if(media >= 7){
                if(media == 10){
                System.out.println("Aprovado nota MÁXIMA");
                }else{                
                System.out.println("Aprovado média mínima");
                }       
            }else{
                System.out.println("Reprovado");
                        } 
        
    }
}
