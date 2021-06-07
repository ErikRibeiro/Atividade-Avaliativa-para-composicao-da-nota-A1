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
public class Salario {
    private double salario=0.00;
    double maior= 0.00 ;
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcular(){
        this.salario = this.salario - this.salario *0.11;
        if(this.salario > maior){
            maior = this.salario;
        }
        return maior;
    }
}
