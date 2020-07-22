/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadebanco;

/**
 *
 * @author edgames
 */
public class ContaDeBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        c1.setDono("Jubileu");
        c1.setNumConta("111111");
        c1.setTipo("cc");
        c1.abrirConta();
        c1.depositar(100f);
        c1.sacar(150f);
        c1.fecharConta();
        
        Conta c2 = new Conta();
        c2.setDono("Creusa");
        c2.setNumConta("222222");
        c2.setTipo("cp");
        c2.abrirConta();
        c2.depositar(300f);
        
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
    
}
