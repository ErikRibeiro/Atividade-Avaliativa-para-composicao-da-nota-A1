/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.control;
/**
 *
 * @author erikr
 */
public class Vendas {
    private double valor=0.00;
    private double desconto=0.00;
    double total =0.00;
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double desconto(){
        desconto = this.valor*0.1;
        total += desconto;
        return total;
    }
}