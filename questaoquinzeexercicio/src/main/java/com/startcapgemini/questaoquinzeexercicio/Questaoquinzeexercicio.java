/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.startcapgemini.questaoquinzeexercicio;

/**
 *
 * @author Jairo
 * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200
 */

import java.util.Scanner;

public class Questaoquinzeexercicio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um valor:");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("Número está no intervalo");   
        }else{
            System.out.println("Número não está15 no intervalo");
        }
    }
}
