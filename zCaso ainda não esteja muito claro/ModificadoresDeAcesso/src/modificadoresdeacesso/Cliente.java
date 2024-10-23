/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadoresdeacesso;

/**
 *
 * @author Talvez
 */
public class Cliente {

    public Cliente() {
    
    }
    
    public void printErro(Pessoa p){
        //Para acessarmos os atributos do Objeto que estamos recebendo no parametro usamos p.Nome do atributo
        
        System.out.println("Nome: " + p.nome);
        
        //O java reclama porque o atributo senha é privado, apenas a classe Pessoa pode ter acesso
        System.out.println("Senha: " + p.senha);
        
        System.out.println("Altura: " + p.altura);
        
        if(p.vivo == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morto");
        }
    }
    
    public void printSemErro(Pessoa p){
        System.out.println("Nome: " + p.nome);
        
        //Usamos o Getter de senha para conseguirmos ver o conteudo do atributo senha, corrigindo a reclamação
        System.out.println("Senha: " + p.getSenha());
        
        System.out.println("Altura: " + p.altura);
        
        if(p.vivo == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morto");
        }
    }
}
