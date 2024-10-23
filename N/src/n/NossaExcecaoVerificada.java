/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n;

/**
 *
 * @author Talvez
 */
//Por ser uma subclasse de Exception, é uma exceção verificada.
public class NossaExcecaoVerificada extends Exception{
    //Não precisamos criar um construtor por ser uma subclasse.
    
    @Override
    public String toString(){
        return "Nome invalido";
    }
}
