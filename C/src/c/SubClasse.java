/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

/**
 *
 * @author Talvez
 */
public class SubClasse extends SuperClasse{
    private String nome;

    public SubClasse(String nome, int pokemon) {
        super(pokemon);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void capturar(){
        System.out.println("O pokemon " + super.getPokemon() + " morreu");
    }
}
