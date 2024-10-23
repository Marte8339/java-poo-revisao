/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m;

/**
 *
 * @author Talvez
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void verificarIdade() throws IllegalArgumentException{
        if (getIdade() < 0 || getIdade() > 150) { //Aqui nós tejmos a condição para a exceção ser gerada.
        //Utilizando o throw nós conseguimos criar uma nova exceção de IllegalArgumentException com sua mensagem de erro.
            throw new IllegalArgumentException("Idade invalida: " + getIdade());
        }
    }

    public void print(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
    
}
