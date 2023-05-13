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
public class Horista extends Empregado {
    int numHoras;
    
 
    @Override
    public void entraDados(){
       super.entraDados();
        System.out.println("Digite o numero de horas Trabalhadas: ");
        numHoras = sc.nextInt();
        
        
    }

    public Horista(int cpf,int numHoras) {
        super(cpf);
        this.numHoras = numHoras;
    }
    
    @Override
    public double calcSalario(){
        double salario = numHoras * 15.50;
        return salario;
    }
 
    
    
    
    
    @Override
    public String toString(){
        return super.toString() 
                +"\nSalario: "+df.format(calcSalario())
                +"\nComissao: "+df.format(super.comissao())
                +"\nRemuneração Total: "+df.format(super.getRemunera()); 
    }
    
    

    
}
