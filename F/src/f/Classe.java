/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f;

/**
 *
 * @author Talvez
 */
public class Classe implements InterfaceUM, InterfaceDois{// implementando as iterfaces InterfaceUM e InterfaceDois
    //Quando uma Classe implementa uma Interface, ela obrigatoriamente deve conter todos os métodos da Interface implementada
    private int num1;
    private int num2;
    private int resuSoma;
    private int resuSub;
    

    public Classe(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    @Override //Métodos da InterfaceDois
    public int soma(){
        return num1 + num2;
    }
    
    @Override
    public int suaRespSoma(int rs){
        return resuSoma = rs;
    }
    
    @Override //Métodos da InterfaceUM
    public int sub(){
        return num1 - num2;
    }
    
    @Override
    public int suaRespSub(int rs){
        return resuSub = rs;
    }
    
    public void print(){
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma());
        System.out.println("Sua resposta foi: " + resuSoma);
        
        System.out.println("");
        
        System.out.println("Sub: " + num1 + " - " + num2 + " = " + sub());
        System.out.println("Sua resposta foi: " + resuSub);
    }
}
