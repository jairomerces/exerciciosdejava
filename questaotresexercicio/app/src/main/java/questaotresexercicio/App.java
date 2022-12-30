/*
 *Escreva um algoritmo para determinar o consumo médio de um automóvel 
sendo fornecida a distância total percorrida pelo automóvel e o total 
de combustível gasto
 */
package questaotresexercicio;


import java.util.Scanner;

public class App {
    /**public String getGreeting() {
        return "Hello World!";
    }*/    
    public static void main(String[] args) {
        float consumo, km, combustivel;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quilometragem (Km):");
        km = leitor.nextFloat();
        System.out.println("Digite o volume de combustivel gasto (l):");
        combustivel = leitor.nextFloat();
        
        consumo = km / combustivel;
        
        System.out.println("Consumo medio do carro: " + consumo + "(Km/l)");
    }
}
