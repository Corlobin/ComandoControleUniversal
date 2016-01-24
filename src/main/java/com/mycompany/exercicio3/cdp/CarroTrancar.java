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
public class CarroTrancar implements Command {
    private Carro carro;
    public CarroTrancar(Carro carro) {
        this.carro = carro;
    }
    
    public void execute() {
        carro.fecharCarro();
    }
    
    @Override
    public String toString() {
        return "CARRO_TRANCAR";
    }
}
