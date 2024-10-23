/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

/**
 *
 * @author Talvez
 */
public class SubClasse extends SuperClasse{
    private String nome;

    //O construtor da SubClasse herda os parametros e Atributos passados no construtor da SuperClasse
    public SubClasse(String nome, String heranca) {
        super(heranca, 843000); //Usando o super() para herdar atributos, podemos passar valores dentro do super() tambem
                     //No lugar de 843000 poderias colocar divida, que é o atributo que já estamos determinado seu valor.
        this.nome = nome;
    }
    
    //O Override é usado para sinalizar que o método esta sendo sobrescrito.
    @Override
    public int pagarDivida(int quantidade) {
        return super.pagarDivida(quantidade); //usando o super. herdamos um metodo com seus processos
    }
    
    @Override //Aqui herdamos o Método print() e sobrescrevemos ele
    public void print(){
        System.out.println("Nome: " + nome);
        super.foda();
        //Pelo Método carta ser um Static, conseguimos chamar ele usando o nome da classe em que ele se encontra, neste caso sendo a SuperClasse
        SuperClasse.carta();
    }
}
