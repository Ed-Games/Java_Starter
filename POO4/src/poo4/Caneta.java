/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;

/**
 *
 * @author edgames
 */
public class Caneta {
     public String modelo;
     private Float ponta;
     private Boolean tampar;
     private String cor;
     
     public Caneta(String m, Float p, Boolean t, String c){
         this.modelo = m ;
         this.ponta = p;
         this.tampar = t;
         this.cor= c;
     }
     
     public String getModelo(){
         return this.modelo;
     }
     
     public Float getPonta(){
         return this.ponta;
     }
     
    public String setModelo(String m){
        this.modelo = m;
         return m;
    } 
    
    public Float setPonta(Float p){
        this.ponta = p;
        return p;
    }
    
    public void tampar(){
        tampar = true;
    }
    
    public void destampar(){
        tampar = false;
    }
    
    public void Status(){
        System.out.println("Sobre a Caneta");
        System.out.println("O modelo é: " +this.modelo);
        System.out.println("A cor é: "+this.cor);
        System.out.println("e a ponta é: " +this.ponta);
             
    }
             
     
     
}
