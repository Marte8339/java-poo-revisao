/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d;

/**
 *
 * @author Talvez
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaArray la = new ListaArray(5);//Instanciando a classe e passando o tamanho da array
        
        la.percorrerListaInt();
        
        System.out.println("--------");
        
        la.percorrerListaString();
    }
    
}
