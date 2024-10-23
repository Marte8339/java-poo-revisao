/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o;

/**
 *
 * @author Talvez
 */
public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void verificaIdade(){
        if(idade < 0 || idade > 150){
            throw new Excecoes();
        }
    }
    
    public void print(){
        try{
            verificaIdade();
            
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        
        }catch(Excecoes exc){
            exc.mostramsg();
            exc.mostramsg(idade);
        }
    }
}
