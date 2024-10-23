/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n;

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
    
    //Criamos um método normal que utiliza o throws para declarar que este método pode gerar uma nova exceção verificada
    //Dentro dele colocamos as condições para uma nova exceção verificada ser gerada
    public void verificaNome() throws NossaExcecaoVerificada{
        if(this.nome.isBlank()){
            //Cria uma exceção verificada da Classe NossaExcecaoVerificada que nós criamos
            throw new NossaExcecaoVerificada();
        }
    }
    
    //Criamos um método normal, dentro dele colocamos as condições para uma nova exceção não verificada ser gerada
    public void verificaIdade(){
        if(idade < 0 || idade > 150){ //Condição
            
            //Cria uma exceção não verificada da Classe NossaExcecaoNaoVerificada que nós criamos
            throw new NossaExcecaoNaoVerificada();
        }
    }
    
    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
