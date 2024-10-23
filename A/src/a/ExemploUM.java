/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

/**
 *
 * @author Talvez
 */
public class ExemploUM {
    //Declarando Atributos.(Criando)
    public String nome;
    private int idade;
    protected long anoDeMatricula;
    int tempoNaFatec;

    //Construtor da Classe ExemploUM.
    public ExemploUM(String nome, long anoDeMatricula, int idade) {
        this.nome = nome;
        this.anoDeMatricula = anoDeMatricula;
        this.idade = idade;
    }
    
    //Getter.
    public int getIdade() {
        return idade;
    }
    
    //Setter.
    public void setIdade(int idade) {
            this.idade = idade;
    }
    
    //Sobrecarga de método
    // Calc() retorna um int, como o atributo tempoNaFatec é int ele "armazena" o valor deste retorno.
    public int calc(){
                  //Usamos o Casting (int) para forçar o atributo long anoDeMatricula passar para um atributo int
        return tempoNaFatec = 2024 - (int)anoDeMatricula;
    }
    
    //Sobrecarga de métodos
    //Faz a mesma coisa que o calc() porem por ter um parâmetro diferente, o Java não reclama.
    public int calc(int anoAtual){
        return tempoNaFatec = anoAtual - (int)anoDeMatricula;
    }
    
    //Como é um método void retorna nada.
    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Inicio da Matricula: " + anoDeMatricula);
        System.out.println("Tempo na Fatec: " + tempoNaFatec);
    }
}
