/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d;

/**
 *
 * @author Talvez
 */
public class ListaArray {

    //criando uma array int
    int[] listaInt;
    
    public ListaArray(int capMaxInt) {
        listaInt = new int [capMaxInt]; //Definindo seu tamanho
    }
    
    public void percorrerListaInt(){
        for(int i = 0; i < listaInt.length ; i++){
            listaInt[i] = i; //Pasando valores para dentro da Array
            System.out.println("Lista Int: " + listaInt[i]); //Mostrando os valores que estão dentro da array
        }
    }
    
    //Criando uma Array do tipo String
    String[] listaString = {"Caique", "Jose", "Domingos"}; // Definindo o tamanho e seus valores
    
    public void percorrerListaString(){
        for(int i = 0; i < listaString.length ; i++){
            System.out.println("Lista String: " + listaString[i]);//Mostrando os valores que estão dentro da array
        }
    }
}
