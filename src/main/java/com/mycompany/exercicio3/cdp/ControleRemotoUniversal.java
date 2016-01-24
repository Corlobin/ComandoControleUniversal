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
public  class ControleRemotoUniversal {
    private Command up, down;
    private Command lastCommand;
    private static Command ultimo;
    
    public void setCommands(Command up, Command down) {
        this.up = up;
        this.down = down;
    }
    
    public void reconhecedorSubir() {
        up.execute();
        ControleRemotoUniversal.ultimo = up;
    }
    public void reconhecedorDescer() {
        down.execute();
        ControleRemotoUniversal.ultimo = down;
    }
    
    public void refazUltimoComando() {
        if(ControleRemotoUniversal.ultimo != null)
            System.out.println("Refazendo ultimo comando do " + ControleRemotoUniversal.ultimo);
            ControleRemotoUniversal.ultimo.execute();
    }
    
    
    
}
