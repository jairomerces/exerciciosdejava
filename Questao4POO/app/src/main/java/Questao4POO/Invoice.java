/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4POO;

/**
 *
 * @author Jairo
 */
public class Invoice {

    private int codigoItem;
    private String descricao;
    private int qtdItem;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int qtdItem, float precoUnitario) {
   
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQtdItem(qtdItem);
        this.setPrecoUnitario(precoUnitario);
        
    }
    
    public double getInvoiceAmount(){
        return qtdItem * precoUnitario;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        if (qtdItem < 0) {
            this.qtdItem = 0;
        } else {
            this.qtdItem = qtdItem;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
         if (precoUnitario < 0) {
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

}
