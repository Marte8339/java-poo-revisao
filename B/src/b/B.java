/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b;

/**
 *
 * @author Talvez
 */
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Por mais que seja uma SuperClasse, ela ainda pode ser instanciada
        SuperClasse spc = new SuperClasse("Vida boa", 0);
        
        spc.pagarDivida(0);
        spc.foda();
        
        System.out.println("------------------------"); 
        //O objeto da SuperClasse não está relacionado com o da SubClasse, caso queira pode apagar as linhas(17 até 24).
        
        SubClasse sc = new SubClasse("Pablo", "Dividas");
        
        sc.pagarDivida(500);
        
        sc.print();
    }
    
}
