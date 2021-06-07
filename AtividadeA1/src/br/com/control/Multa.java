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
public class Multa {
    private int tipo_multa;
    private String valor_multa;

    public int getTipo_multa() {
        return tipo_multa;
    }

    public void setTipo_multa(int tipo_multa) {
        this.tipo_multa = tipo_multa;
    }
    
    public String valor_multa(){
        if(this.tipo_multa==1){
            this.valor_multa = "Multa tipo 1 valor R$ 113";
        }
        if(this.tipo_multa==2){
            this.valor_multa = "Multa tipo 2 valor R$ 175";
        }
        if(this.tipo_multa==3){
            this.valor_multa = "Multa tipo 3 valor R$ 305";
        }
        return valor_multa;
    }
}
