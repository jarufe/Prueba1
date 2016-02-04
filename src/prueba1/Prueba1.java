/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import prueba2.*;

/**
 *
 * @author javier.arufe
 */
public class Prueba1 {
    Prueba2 oValor;

    public Prueba1() {
    }

    public Prueba2 getoValor() {
        return oValor;
    }

    public void setoValor(Prueba2 oValor) {
        this.oValor = oValor;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba1 oPrueba = new Prueba1();
        oPrueba.oValor = new Prueba2();
        oPrueba.oValor.setnValor(10);
        System.out.println("Valor: " + oPrueba.oValor.getnValor());
    }
    
}
