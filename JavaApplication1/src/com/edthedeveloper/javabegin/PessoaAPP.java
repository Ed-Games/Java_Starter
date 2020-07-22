/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edthedeveloper.javabegin;

import java.util.Scanner;

/**
 *
 * @author edgames
 */
public class PessoaAPP {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(1,"João");
        Pessoa pessoa2 = new Pessoa(2,"Maria");
        
        System.out.println("O nome da primeira pessoa é "+pessoa1.getName()+" e seu código é "+pessoa1.getCodigo());
        System.out.println("O nome da segunda pessoa é "+pessoa2.getName()+" e seu código é "+pessoa2.getCodigo());
        
        Scanner getNewName = new Scanner(System.in);
        
        String newName = getNewName.toString();
        
        pessoa1.setName(newName);
        
        System.out.println("O nome da segunda pessoa é "+pessoa2.getName()+" e seu código é "+pessoa2.getCodigo());
        
       /* System.out.println("Pessoa1:");
        System.out.print("código:");
        System.out.println(pessoa1.codigo);
        System.out.print("nome:");
        System.out.println(pessoa1.name);
        System.out.print("código:");
        System.out.println(pessoa2.codigo);
        System.out.print("nome:");
        System.out.println(pessoa2.name);
        */
         
    }
}
