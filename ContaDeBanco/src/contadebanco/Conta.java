/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadebanco;

import java.util.Scanner;

/**
 *
 * @author edgames
 */
public class Conta {
    public String numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private Boolean status;
    
    public Conta(){
        this.status = false;
        this.saldo = 0f;
    }
    
    public void estadoAtual(){
        System.out.println("Informações da conta");
        System.out.println("Número: "+this.getNumConta());
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public void abrirConta(){
        Scanner resp = new Scanner(System.in);
        System.out.println("Por favor informe o tipo da conta");
        System.out.println("cc para conta corrente ou cp para conta poupança");
        String t= resp.nextLine();
        this.tipo = t;
        this.status = true;
        
        System.out.println("Conta aberta com sucesso");
        
        if("cp".equals(this.tipo)) this.saldo = 150f;
        else if("cc".equals(this.tipo)) this.saldo = 50f;
    } 
    
    public void fecharConta(){
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta fechada com sucesso");
        } else if (this.saldo < 0){
            System.out.println("Conta em débito");
        } else {
            System.out.println("Dinheiro não sacado ");
        }
    }
    
    public void depositar(Float valor){
        if(this.status == true){
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso na conta de " +this.getDono());
        } else {
            System.out.println("Essa conta esta trancada");
        }
    }
    
    public void sacar(Float saque){
        
        if(this.status){
            if(this.saldo >= saque){
            this.saldo = saldo - saque;
            System.out.println("saque realizado com sucesso na conta de "+this.getDono());
            } else{
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Conta esta trancada \n impossível depositar");
        }
        
    }
    
   public void pagarMensalidade(){
       Float v = null;
       
       if(this.tipo.equals("cc")) v = 12f;
       else if (this.tipo.equals("cp")) v= 20f;
       
      if(this.status) {
          if(this.saldo > v) {
              this.saldo = this.saldo - v;
              System.out.println("Mensalidade paga com sucesso por " +this.getDono());
            }else System.out.println("Saldo insuficiente");
        } else{
            System.out.println("Impossível pagar");
        }
    } 
    
    
    
}
