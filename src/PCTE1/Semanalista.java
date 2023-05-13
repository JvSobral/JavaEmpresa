/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE1;

/**Comentário estilo JavaDoc
 * ETB - Escola Técnica De Brasília
 * Curso: Técnico em Informática
 * Disciplina: LTP1/Java
 * Autor: João Victor  Turma: 2F  Data:29.11.2019 
 */
public class Semanalista extends Empregado{
    int numSem;
    
    
    @Override
    public void entraDados(){
        super.entraDados();
        System.out.println("Digite as semanas trabalhadas: ");
        numSem = sc.nextInt();
        
    }
    
    public Semanalista(int cpf, int numSem) {
        super(cpf);
        this.numSem = numSem;
    }
    
    
    @Override
    public double calcSalario(){
      double salario = numSem * 100;
      return salario;
        
    }
    
    
    

   
    
    
    
    @Override
    public String toString (){
        return super.toString() 
                +"\nSalario: "+df.format(calcSalario())
                +"\nComissao: "+df.format(super.comissao())
                +"\nRemuneração Total: "+df.format(super.getRemunera());
        
    }
    
}
