/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j;

/**
 *
 * @author Talvez
 */
public class J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Caique", 20);
        Pessoa p2 = new Pessoa(2, "Luiz", 32);
        Pessoa p3 = new Pessoa(3, "Gustavo", 90);
        
        ArrayObjeto aro = new ArrayObjeto(7);//Criamos o Objeto, e definimos sua capMaxPessoas
        
        //adicionando Objetos ao Array
        aro.addPessoa(p1);
        aro.addPessoa(p2);
        aro.addPessoa(p3);
        
        //É possivel criar Objetos dentro do parametro do método
        aro.addPessoa(new Pessoa(4, "Paula", 20));
        
        //Percorremos e mostramos os valores nas posições do Array
        aro.print();
    }
    
}
