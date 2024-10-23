/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadoresfs;

/**
 *
 * @author Talvez
 */
public class Pessoa {
    public final String nome;
    
    public final int idade;
    
//Por ser um atributo static não é possivel criar um Objeto com ele, ou seja, não é possivel colocalo no construtor da classe.
    private static int idadeMinima = 18; 

    public Pessoa(String nome, int idade) {
        this.nome = nome; //A partir do momento em que um atributo final recebe valor, ele não pode mais ser alterado.
        this.idade = idade; //A partir do momento em que um atributo final recebe valor, ele não pode mais ser alterado.
    }
    
    //Por serem Getter e Setter de um atributo static, eles tambem são Getter e Setter static
    //Então para termos acesso a eles teremos que usar NomeDaClasse.get(ou set)NomeDoAtributo().
    //Neste caso Pessoa.get(ou set)IdadeMinima()
    public static int getIdadeMinima() {
        return idadeMinima;
    }
    public static void setIdadeMinima(int idadeMinima) {
        Pessoa.idadeMinima = idadeMinima;
    }
    
    public final void print(){ //Por ser um método final ele não pode ser sobrescrito
        System.out.println("Nome: " + nome);
        System.out.println("Idade:  " + idade);
    }
}
