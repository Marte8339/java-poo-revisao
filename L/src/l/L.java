/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l;

/**
 *
 * @author Talvez
 */
public class L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //cf de Calculo Funcional
        Calculo cf = new Calculo(4, 2); //Passamos os valores para executar uma divisão, int
        cf.calc(); //Executamos a divisão e mostramos o resultado
        
        System.out.println("-----------------------");
        
        //ce de Calculo com Exceção
        Calculo ce = new Calculo(2, 0); 
        /*
        Passamos os valores para executar uma divisão por 0, como um numero não pode ser dividido por 0, 
        Java lança a exceção: ArithmeticException
        
        Para resolvermos isto, podemos utilizar o try e o catch na main ou na Classe em que a exceção ocorre
        */
        ce.calc(); //Executamos a divisão
    }
    
}
