/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g;

/**
 *
 * @author Talvez
 */
public class Pessoa {
    private String nome;
    
    private DataNasc datanascimento;//Criando o atributo para armazenar Objetos da classe DataNasc

    public Pessoa(String nome, DataNasc datanascimento){//Pegando o Objeto passado na classe main, pelo parametro do construtor
        this.nome = nome;
        this.datanascimento = datanascimento;
    }
    
    public void print(){
        System.out.println("Nome: " + nome +
        //Por datanascimento armazenar um Objeto da classe DataNasc, conseguimos utiliza-la para acessar os métodos Getter e Setter
                          "\nData de Nascimento" +
                          "\nDia: " + datanascimento.getDia() +
                          "\nMes: " + datanascimento.getMes() +
                          "\nAno: " + datanascimento.getAno());
        
        System.out.println("--------\nMetodo printData: ");
        
        //Por datanascimento armazenar um Objeto da classe DataNasc, conseguimos utiliza-la para acessar métodos da Classe DataNasc
        datanascimento.printData();
        
        //Podemos utilizar qualquer uma das duas maneiras
    }
}
