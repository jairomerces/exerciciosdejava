/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.startcapgemini.estruturadeescolha;

/**
 *
 * @author Jairo
 */
import java.util.Scanner;

public class EstruturadeEscolha {
    
    
    public static void main(String[] args) {
        
      Scanner leitor = new Scanner(System.in);  
      
      String menu;
      int opcao, valor1, valor2, resultado;
      
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        opcao = leitor.nextInt();
      
      switch(opcao){
      
          case: 1                 
            System.out.println("Digite um número:");
            valor1 = leitor.nextInt();
            System.out.println("Digite um número:");
            valor2 = leitor.nextInt();
            
            resultado = valor1 + valor2;
            System.out.println(resultado);
                  break;
          case: 2
            System.out.println("Digite um número:");
            valor1 = leitor.nextInt();
            System.out.println("Digite um número:");
            valor2 = leitor.nextInt();
            
            resultado = valor1 - valor2;
            System.out.println(resultado);
                  break;
          case: 3
            System.out.println("Digite um número:");
            valor1 = leitor.nextInt();
            System.out.println("Digite um número:");
            valor2 = leitor.nextInt();
            
            resultado = valor1 * valor2;
            System.out.println(resultado);
                  break;
          case: 4
            System.out.println("Digite um número:");
            valor1 = leitor.nextInt();
            System.out.println("Digite um número:");
            valor2 = leitor.nextInt();
            
            resultado = valor1 / valor2;
            System.out.println(resultado);
                  break;    
                  
          default:
      
      }
      
    }
}
