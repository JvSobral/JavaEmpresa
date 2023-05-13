/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE2;

import PCTE1.Horista;
import PCTE1.Semanalista;
import java.util.Scanner;

/**Comentário estilo JavaDoc
 * ETB - Escola Técnica De Brasília
 * Curso: Técnico em Informática
 * Disciplina: LTP1/Java
 * Autor: João Victor  Turma: 2F  Data:29.11.2019 
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean loop = true;
        while (loop){
            System.out.println("Escolha uma Opção: "
                    + "\n[1]Semanalista"
                    + "\n[2]Horista"
                    + "\n[3]Sair");
            int op = sc.nextInt();
            
            switch (op){
                case 1 :
                    
                    Semanalista sm = new Semanalista(0,0);
                    sm.entraDados();
                    sm.calcRemu();
                    System.out.println(sm.toString());
                    break;
                case 2 :
                    Horista hr = new Horista(0,0);
                    hr.entraDados();
                    hr.calcRemu();
                    System.out.println(hr.toString());
                    break;
                case 3:
                    for (int i = 0; i < 50; i++)
                        System.out.println("");
                    System.out.println("Progama Encerrado!!");
                    System.exit(0);
                default :
                    System.out.println("Opção Invalida \nTente Novamente");
                    
            }
            
            
            
            
        }
        
        
    }
    
}
