/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

/**
 *
 * @author Talvez
 */
public abstract class SuperClasse { //Criando a classe abstract
    private int pokemon;

    public SuperClasse(int pokemon) {
        this.pokemon = pokemon;
    }

    public int getPokemon() {
        return pokemon;
    }
    public void setPokemon(int pokemon) {
        this.pokemon = pokemon;
    }
    
    //Não é possivel ter um método abstract em uma classe normal
    public abstract void capturar();
}
