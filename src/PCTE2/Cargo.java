/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE2;

import java.util.Scanner;

/**Comentário estilo JavaDoc
 * ETB - Escola Técnica De Brasília
 * Curso: Técnico em Informática
 * Disciplina: LTP1/Java
 * Autor: João Victor  Turma: 2F  Data:29.11.2019 
 */
public class Cargo {
   Scanner sc = new Scanner(System.in);
    private int codigo;
    private String nomeCargo;

    
     public Cargo(String nomeCargo , int codigo){
         this.nomeCargo = nomeCargo;
         this.codigo = codigo;
        
    }

    
    
    public void entraDados(){
        System.out.println("Digite seu cargo: ");
        nomeCargo = sc.nextLine();
        System.out.println("Digite o codigo do Cargo: ");
        codigo = sc.nextInt();
    }
    
   @Override
    public String toString(){
        return "Cargo "+nomeCargo
                +"\nCodigo do Cargo: "+codigo;
    }
    
   
   
    
}
