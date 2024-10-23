/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package i;

/**
 *
 * @author Talvez
 */
public class I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CopyConstrutor ccOriginal = new CopyConstrutor("Caique", "2231314");
        
        ccOriginal.concaternar();
        ccOriginal.print();
        
        System.out.println("----------");
        
        //Cria um novo Objeto que Copia a classe Original, tem os mesmos atributos e métodos.
        CopyConstrutor ccCopia = new CopyConstrutor(ccOriginal);
        
        ccCopia.concaternar();
        ccCopia.print();
    }
    
}
