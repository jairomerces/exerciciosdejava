/*
 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário 
fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o seu nome, o salário fixo e salário no final do mês;
 */
package questaoquatroexercicio;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        float salfixo, salfinal, totalvendas;
        float comissao = (float) 0.15;
        
        
        System.out.println("Digite o nome do vendedor:");
        nome = leitor.next();
        System.out.println("Digite o salario fixo:");
        salfixo = leitor.nextFloat();
        System.out.println("Digite valor (R$) de vendas/mes:");
        totalvendas = leitor.nextFloat();
        
        //comissao = comissao * totalvendas;
        salfinal = salfixo + (comissao * totalvendas);
        
        System.out.println("Vendedor: " + nome);
        System.out.println("Salario Fixo: " + salfixo);
        System.out.println("Salario Final: " + salfinal);
        
    }
}
