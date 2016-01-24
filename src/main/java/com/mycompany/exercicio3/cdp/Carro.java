/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3.cdp;

/**
 *
 * @author Ricardo
 */
public class Carro {
    private StatusCarro status;

    public Carro() {
        status = StatusCarro.FECHADO;
        System.out.println("Carro está fechado");
    }
    
    public void abrirCarro() {
        status = StatusCarro.ABERTO;
        System.out.println("Carro está aberto");        
    }
    
    public void fecharCarro() {
        status = StatusCarro.FECHADO;
        System.out.println("Carro está fechado");        
    }
    
    
    
    
    
}
