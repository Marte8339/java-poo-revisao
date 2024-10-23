/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n;

/**
 *
 * @author Talvez
 */
//Por ser uma subclasse de RuntimeException, é uma exceção não verificada.
public class NossaExcecaoNaoVerificada extends RuntimeException{
    //Não precisamos criar um construtor por ser uma subclasse.
    
    @Override
    public String toString(){
        return "Idade invalida";
    }
    
}
