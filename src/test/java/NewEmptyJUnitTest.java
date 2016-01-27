/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exercicio3.cdp.Carro;
import com.mycompany.exercicio3.cdp.CarroDestrancar;
import com.mycompany.exercicio3.cdp.CarroTrancar;
import com.mycompany.exercicio3.cdp.Command;
import com.mycompany.exercicio3.cdp.ControleRemotoUniversal;
import com.mycompany.exercicio3.cdp.PortaoAbrir;
import com.mycompany.exercicio3.cdp.PortaoEletronico;
import com.mycompany.exercicio3.cdp.PortaoFechar;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testaCarro() {
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
        Assert.assertEquals(controle.getUltimoCommand(), "PORTAO_FECHAR");
    }
}
