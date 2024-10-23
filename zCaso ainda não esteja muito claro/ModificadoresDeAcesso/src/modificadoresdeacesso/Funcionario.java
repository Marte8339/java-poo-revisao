/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadoresdeacesso;

/**
 *
 * @author Talvez
 */
public class Funcionario extends Pessoa{
    
    //Por ser uma Subclasse de Pessoa recebemos os parametros recebidos por ela
    public Funcionario(String nome, int senha, double altura, boolean vivo) {
        super(nome, senha, altura, vivo);
    }
    
    public void printErro(){
        //Por ser uma Subclasse de Pessoa, não existe a necessidade de recebermos o Objeto de Pessoa
        
        System.out.println("Nome: " + nome);
        
        //O java reclama porque o atributo senha é privado, apenas a classe Pessoa pode ter acesso
        System.out.println("Senha: " + senha);
        
        System.out.println("Altura: " + altura);
        
        if(vivo == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morto");
        }
    }
    
    public void printSemErro(){
        System.out.println("Nome: " + nome);
        
        System.out.println("Senha: " + getSenha());
        
        System.out.println("Altura: " + altura);
        
        if(vivo == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morto");
        }
    }
}
