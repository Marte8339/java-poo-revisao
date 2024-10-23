/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e;

/**
 *
 * @author Talvez
 */
public class ArrayMultidimensional {
    
    public ArrayMultidimensional() {
        
    }
    
    //Criando e definindo os valores e o tamanho da array
    int[][] arrayBidimensional = {
        {4,17,21},
        {3,18,49},
        {90,23,1}
    };
    
    public void percorrendoArrayBidimensional(){
        System.out.println("Array Bidimensional");
        
        for(int i = 0; i < arrayBidimensional.length; i++){ //Percorrendo as Linhas da Array
            for(int j = 0; j < arrayBidimensional[i].length; j++){ //Percorrendo as Colunas da Array
                System.out.println("linha " + i + " coluna " + j + " = " + arrayBidimensional[i][j]);
            }
        }
    }
    
    //Criando e definindo o tamanho da array
    int[][][] arrayTridimensional = new int[3][3][3];
    
    public void percorrendoArrayTridimensional(){
        System.out.println("Array Tridimensional");
        
        for(int i = 0; i < arrayTridimensional.length; i++){ //Percorrendo as Linhas da Array
            for(int j = 0; j < arrayTridimensional[i].length; j++){ //Percorrendo as Colunas da Array
                for(int k = 0; k < arrayTridimensional[i][j].length; k++){ //Percorrendo as "faces" da Array
                    //Definindo os valores da array
                    arrayTridimensional[i][j][k] = k + j + i;
                    System.out.println("linha " + i + " coluna " + j + " face " + k + " = " + arrayTridimensional[i][j][k]);
                }
            }
        }
    }
    
    //As Arrays tem multidimensões então é possivel criar arrays maiores só adicionando []
    
}
