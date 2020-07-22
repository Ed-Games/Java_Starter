/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import poo1.classes.Caneta;

/**
 *
 * @author edgames
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta bic = new Caneta();
        bic.cor = "Azul";
        bic.carga = 90;
        bic.modelo = "xvb-90";
        bic.ponta = 0.5f;
        bic.tampada= true;
        System.out.println(bic.cor);
        
        bic.Destampar();
        bic.showState();
        bic.Rabiscar2();
    }
    
}
