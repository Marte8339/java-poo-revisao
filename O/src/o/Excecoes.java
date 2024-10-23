/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o;

/**
 *
 * @author Talvez
 */
public class Excecoes extends RuntimeException{
    
    public void mostramsg(){
        System.out.println("Idade invalida");
    }
    
    public void mostramsg(int idade){
        if(idade < 0){
            System.out.println(idade + " anos, Voce ta novinho ne fi");
        }
        if(idade > 150){
            System.out.println(idade + " anos, Certeza que seu CPF ja nao ta cancelado");
        }
    }
}
