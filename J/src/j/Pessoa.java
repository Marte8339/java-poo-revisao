/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j;

/**
 *
 * @author Talvez
 */
public class Pessoa {
    private int idPessoa;
    private String nome;
    private int idade;

    public Pessoa(int idPessoa, String nome, int idade) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
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
    
    public void printFormato(){
        System.out.println("ID: " + getIdPessoa() + "\nNome: " + getNome() + "\nIdade: " +getIdade());
    }
}
