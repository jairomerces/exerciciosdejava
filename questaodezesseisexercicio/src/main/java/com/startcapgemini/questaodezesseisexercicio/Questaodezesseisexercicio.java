/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.startcapgemini.questaodezesseisexercicio;

/**
 *
 * @author Jairo
 * 
 * Escreva um algoritmo que leia o nome e as três notas obtidas por 
 * um aluno durante o semestre. Calcular a sua média (aritmética), 
 * informar o nome e sua menção aprovado (media >= 7), 
 * Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)
 */
import java.util.Scanner;


public class Questaodezesseisexercicio {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        //String nome;
        //double media, nota1, nota2, nota3;
        double mediari = 3;
        
        //System.out.println("Digite o nome do aluno:");
        String nome = leitor.next();
        //System.out.println("Insira uma Nota1:");
        double nota1 = leitor.nextDouble();
        //System.out.println("Insira uma Nota2:");
        double nota2 = leitor.nextDouble();
        //System.out.println("Insira uma Nota3:");
        double nota3 = leitor.nextDouble();
        
        double media = nota1 + nota2 + nota3 / mediari;
        
        if(media >= 7){
            System.out.println(nome + ", foi Aprovado");
            }else{
                if(media >= 5 && media <= 7){
                   System.out.println(nome + ", está na Recuperação");
                }else{
               System.out.println(nome + ", foi Reprovado");
               }
            }
            
      
    }
}
