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
public class PortaoFechar implements Command {
     private PortaoEletronico portao;

    public PortaoFechar(PortaoEletronico portao) {
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.fecharPortao();
    }
    @Override
    public String toString() {
        return "PORTAO_FECHAR";
    }
}
