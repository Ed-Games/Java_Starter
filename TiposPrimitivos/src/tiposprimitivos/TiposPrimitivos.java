/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author edgames
 */

import java.util.Scanner;

public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno");
        String nome = input.nextLine();
        System.out.println("Informe a nota do aluno");
        float nota = input.nextFloat();
        
        //System.out.println("A nota é " +nota);
        System.out.format("A nota de %s é: %.2f \n",nome,nota);
        
        Integer idade = 25;
        String idade1 = idade.toString();
           
        
    }
    
}
