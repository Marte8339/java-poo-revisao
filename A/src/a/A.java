/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;

/**
 *
 * @author Talvez
 */
public class A {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Instanciando a classe ExemploUm(criando um Objeto)
        ExemploUM ex1 = new ExemploUM("Caique", 2022, 20);
        //ex1 é a variavel de referencia que faz referencia a este Objeto em especifico
        
        ex1.calc(2030); //Chama o método calc() sem parametro
        ex1.print(); //Chama o método print()
        
        System.out.println("--------------------");
        
        //Instanciando a classe ExemploUm(criando um Objeto)
        ExemploUM ex2 = new ExemploUM("Talvez", 2022, 27);
        //ex2 é a variavel de referencia que faz referencia a este Objeto em especifico
        
        ex2.calc(2027); //Chama o método calc() com parametro
        ex2.print(); //Chama o método print()
    }
    
}
