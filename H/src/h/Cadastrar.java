/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h;

/**
 *
 * @author Talvez
 */
public class Cadastrar {
    public Cadastrar() {
        
    }
    
    public Funcionario cadastrarFuncionario(int ids, Pessoa p){
        return new Funcionario(ids, p.getNome());
    }
}
