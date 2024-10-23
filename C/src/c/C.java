/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c;

/**
 *
 * @author Talvez
 */
public class C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diferente da SuperClasse normal, uma SuperClasse abstract não pode ser instanciada
        
        //Se a tirarmos do comentario veremos que o Java vai reclamar
        //SuperClasse spc = new SuperClasse(324);
        
        SubClasse sb = new SubClasse("Caique", 445);
        sb.capturar();
    }
    
}
