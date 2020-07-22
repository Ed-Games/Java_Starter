/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import java.util.Scanner;

/**
 *
 * @author edgames
 */
public class Caneta {
    public String modelo;
    public String cor;
    private Float ponta;
    protected Integer carga;
    private Boolean tampada;
    
    public void Rabiscar2(){
    
        if (this.tampada == true){
            System.out.println("ERROR!!!");
        
        }else {
            System.out.println("Rabiscar");
        }
    }
    
    public void Tampar(){
    
        this.tampada = true;
    }
    
    public void Destampar(){
    
        this.tampada = false;
    }
    
    public void Rabiscar(){
        
        Scanner resp = new Scanner(System.in);
        
        
        if(this.tampada==false){ 
            System.out.println("rabiscar");
        }
        else {
            System.out.println("Deseja destampar S/N?");
            resp.nextLine();
            System.out.println(resp);
            if(resp.toString()=="S" || resp.toString()== "s") this.Destampar();
            else System.out.println("Não pode rabiscar");
        }
        
    }
    
    public void showState(){
    
        System.out.println("o  modelo é : "+this.modelo);
        System.out.println("A cor é : "+this.cor);
        System.out.println("A ponta é : "+this.ponta);
        System.out.println("A carga está em : " +this.carga+ "%");
        
        if(tampada) System.out.println("esta tampada");
        else System.out.println("não esta tampada");
    }
}
