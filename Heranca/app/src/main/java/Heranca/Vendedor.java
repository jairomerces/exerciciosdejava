/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author Jairo
 */
public class Vendedor extends Funcionario{
    
    private int totalItenVendidos;
    private float comissaoporIten;
    
    public Vendedor(){
        super();
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoporIten * totalItenVendidos);
    }

    public int getTotalItenVendidos() {
        return totalItenVendidos;
    }

    public void setTotalItenVendidos(int totalItenVendidos) {
        this.totalItenVendidos = totalItenVendidos;
    }

    public float getComissaoporIten() {
        return comissaoporIten;
    }

    public void setComissaoporIten(float comissaoporIten) {
        this.comissaoporIten = comissaoporIten;
    }
    
    
    
}
