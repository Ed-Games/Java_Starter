/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edthedeveloper.javabegin;

/**
 *
 * @author edgames
 */
public class Pessoa {
    
   private int codigo;
   private String name;    
    
    public Pessoa(int codigo, String name ){
        this.codigo = codigo;
        this.name = name;
}
    
    public String getName(){
        return name;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
}
