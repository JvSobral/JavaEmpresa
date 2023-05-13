/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE1;

import PCTE2.Cargo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**Comentário estilo JavaDoc
 * ETB - Escola Técnica De Brasília
 * Curso: Técnico em Informática
 * Disciplina: LTP1/Java
 * Autor: João Victor  Turma: 2F  Data:29.11.2019 
 */
public class Empregado {
    DecimalFormat df = new DecimalFormat ("R$ #,## 0.00");    
    Scanner sc = new Scanner(System.in);    
        private String nome;
        private String cpf;
        private double remunera;
        Cargo cargo = new Cargo("",0);
        
        
        public Empregado(int cpf){
            
         
        }
        
        public void entraDados(){
            System.out.println("Digite seu nome: ");
            nome = (sc.nextLine());
            System.out.println("Digite seu CPF: ");
            cpf = (sc.nextLine());
            cargo.entraDados();
            
        }
        
        
        
        public double comissao(){
            double comissao = (calcSalario()*2)/100;
            return comissao;
            
        }
        public double calcSalario(){
            return 0;
        }
        public void calcRemu(){
           remunera = comissao() + calcSalario();
            
        }
        @Override
        public String toString(){
            return "Nome: "+nome
                    +"\nCPF: "+cpf
                    +"\n"+cargo.toString();
            
        }

   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public double getRemunera() {
        return remunera;
    }

   
    public void setRemunera(double remunera) {
        this.remunera = remunera;
    }


    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}
