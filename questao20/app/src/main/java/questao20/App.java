/*
 * . 
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos 
com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o 
valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado
de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema 
deverá perguntar se deseja continuar calculando desconto até que a 
resposta seja:“(N) Não”. Informar total de carros com ano até 2000 e total geral
 
@autor Jairo Mercês
*/
package questao20;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
       
        //int anoFabricacao = 0;
        //float valorVeiculo = 0.0f;
        char desejaRepetir = 's';
        Scanner leitor = new Scanner(System.in);
        float porcentagemDesconto = 0.00f;
        //float valorDesconto = 0.0f;
        int totalVeiculoSemiNovos = 0;
        int totalVeiculos = 0;
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {            
            
            //System.out.println("Digite o ano de fabricacao do veiculo: ");
            int anoFabricacao = leitor.nextInt();
            //System.out.println("Digite o valor do veiculo: ");
            float valorVeiculo = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            }else{
                porcentagemDesconto = 0.07f;
                totalVeiculoSemiNovos++;
            }
            totalVeiculos++;
            
            float valorDesconto = valorVeiculo * porcentagemDesconto;
            float valorpagar = valorVeiculo - valorDesconto;
            
            System.out.println("O valor de desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago é: " + valorpagar);
            
            System.out.println("Deseja fazer mais cadastros: S - Sim / N - Não "
                    + ":");
            desejaRepetir = leitor.next().charAt(0);
        }
        System.out.println("Total de veiculos semi novos: " + totalVeiculoSemiNovos);
        System.out.println("Total de veiculos: " + totalVeiculos);
        
    }
}
