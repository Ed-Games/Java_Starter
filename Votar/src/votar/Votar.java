/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votar;

import java.util.Scanner;

/**
 *
 * @author edgames
 */
public class Votar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner idade = new Scanner(System.in);
        
        Integer idadeEleitor = idade.nextInt();
        
        if(idadeEleitor>=18 && idadeEleitor<=70){
            System.out.println("Voto Obrigatório");
        } else if(idadeEleitor>70 || idadeEleitor>=16 && idadeEleitor<18){
                System.out.println("Voto opcional");
            } else{
                System.out.println("Não pode votar");
            }
    }
    
}
