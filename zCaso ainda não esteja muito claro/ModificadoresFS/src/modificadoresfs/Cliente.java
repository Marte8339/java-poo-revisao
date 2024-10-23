/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadoresfs;

/**
 *
 * @author Talvez
 */
public class Cliente extends Pessoa{

    public Cliente(String nome, int idade) {
        super(nome, idade);
    }
    
    /*
        @Override
        public void print(){ //Por ser um método final ele não pode ser sobrescrito

        }
    */
    
    public void printNovo(){
        print(); //Mas ser um método final não o impede de ser chamado

//Para ter acesso ao idadeMinima, utilizamos o Getter por ser um atributo privado e Pessoa. por ser um atributo static
        if(idade < Pessoa.getIdadeMinima()){ 
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
        }
    }
}
