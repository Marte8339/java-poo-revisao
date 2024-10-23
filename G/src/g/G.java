/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g;

/**
 *
 * @author Talvez
 */
public class G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DataNasc dtN = new DataNasc(23,12,2004);//Instanciando a classe DataNasc para "Criar" um objeto
        
        Pessoa p1 = new Pessoa("Caique", dtN);//Passando o Objeto usando a variavel de referencia dtN, pelo construtor da classe Pessoa
        p1.print();
    }
    
}
