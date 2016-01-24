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
public class PortaoEletronico {
    private StatusPortao status;

    public PortaoEletronico() {
        status = StatusPortao.FECHADO;
        System.out.println("Portão está fechado");
    }
    
    public void abrirPortao() {
        status = StatusPortao.ABERTO;
        System.out.println("Portão está aberto");
    }
    public void fecharPortao() {
        status = StatusPortao.FECHADO;
        System.out.println("Portão está fechado");
    }
    
}
