/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calcularIMC;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Pessoa objetoPessoa = new Pessoa();
        //classificacaoIMC objetoClassificacaoIMC = new classificacaoIMC();
   
        
        System.out.println("Digite o peso: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura: ");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC = "+ objetoPessoa.calcularIMC());
        
        if(objetoPessoa.calcularIMC() < 18.5){
            System.out.println("Abaixo do Peso");
        } else{
            if(objetoPessoa.calcularIMC() >= 18.5 && objetoPessoa.calcularIMC() <= 24.9){
                System.out.println("Peso normal");
            }else{
                if(objetoPessoa.calcularIMC() >= 25 && objetoPessoa.calcularIMC() <= 29.9){
                    System.out.println("Acima do peso");
                }else{
                    System.out.println("Obesidade");
                }
            }
        }
    }
}
