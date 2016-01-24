/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio3.application;

import com.mycompany.exercicio3.cdp.*;


/**
 *
 * @author Ricardo
 */
public class Application {
    public static void main(String ricardinholindo[]){ 
        // Criando um carro e portao
        Carro hb20 = new Carro();
        hb20.abrirCarro();
        Command carroTrancar = new CarroTrancar(hb20);
        Command carroDestrancar = new CarroDestrancar(hb20);
        
        PortaoEletronico portaoRossi = new PortaoEletronico();
        portaoRossi.abrirPortao();
        Command portaoAbrir = new PortaoAbrir(portaoRossi);
        Command portaoFechar = new PortaoFechar(portaoRossi);
        
        // Reconhecedor
        ControleRemotoUniversal controle = new ControleRemotoUniversal();    
        controle.setCommands(carroDestrancar, carroTrancar);
        
        System.out.println("Iniciando o controle remoto com o carro");
        controle.reconhecedorSubir();
        controle.reconhecedorDescer();
        controle.refazUltimoComando();
        
        System.out.println("Iniciando o controle remoto com o portao");
        controle.setCommands(portaoAbrir, portaoFechar);
        controle.reconhecedorSubir();
        controle.reconhecedorDescer();
        controle.refazUltimoComando();
        
        
    }
    
}
