/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l;

/**
 *
 * @author Talvez
 */
public class Calculo {
    private int numUM;
    private int numDOIS;
    private int resultado;
    
    public Calculo(int numUM, int numDOIS) {
        this.numUM = numUM;
        this.numDOIS = numDOIS;
    }
    
    public void calc(){
        
        try{
            resultado = numUM / numDOIS;
            print();//Chamamos print()
        }
        
        catch(ArithmeticException exc){//exc é a variavel de referencia que eu defini, poderia ser qualquer outra coisa
            printErro();//Chamamos printErro()
            System.out.println("Excecao encontrada: " + exc + "\nMotivo da excecao: " + exc.getMessage());
            //Mostramos qual exceção foi encontrada e o motivo, neste caso, o motivo foi a tentativa de divisão por 0
        }
        
        finally{
            System.out.println("\nIndependente do que acontecer o finnaly executa");
        }
    }

    

    public void print(){
        System.out.println("Calculo bem sucedido:\nResultado: " + resultado);
    }
    
    public void printErro(){
        System.out.println("Calculo mal sucedido:\nResultado nao encontrado");
    }
    
}
