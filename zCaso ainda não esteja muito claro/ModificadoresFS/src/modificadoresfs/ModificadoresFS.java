/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modificadoresfs;

/**
 *
 * @author Talvez
 */
public class ModificadoresFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Caique", 20);
        
        p.print();
        
        System.out.println("--------------");
        
        Cliente c = new Cliente("Caique", 20);
        
        c.printNovo();
    }
    
}
