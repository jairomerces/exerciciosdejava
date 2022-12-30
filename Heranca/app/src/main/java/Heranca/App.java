package Heranca;

import java.util.Date;

public class App {
    

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Carlos");
        v.setCpf("098765434321");
        v.setSalario(1000.0f);
        v.setDataNascimento(new Date());
        v.setComissaoporIten(10.0f);
        v.setTotalItenVendidos(20);
        
        System.out.println("Vendedor: " + v.getNome());
        System.out.println("CPF: " + v.getCpf());
        System.out.println("Salario + Comissao: " + v.calcularSalario());
        System.out.println("Data de nascimento: " + v.getDataNascimento());
                
        Motorista m = new Motorista();
        
        
    }
}
