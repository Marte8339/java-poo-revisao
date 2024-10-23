/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadoresdeacesso.novopackage;

import modificadoresdeacesso.Pessoa; //Estamos importando somente a classe Pessoa

/**
 *
 * @author Talvez
 */
public class CEO {

    public CEO() {
        
    }
    
    public void printErro(Pessoa p){
        //Para acessarmos os atributos do Objeto que estamos recebendo no parametro usamos p.Nome do atributo
        
        System.out.println("Nome: " + p.nome);
        
        //O java reclama porque o atributo senha é privado, apenas a classe Pessoa pode ter acesso
        System.out.println("Senha: " + p.senha);
        
        //O java reclama porque o atributo altura é protected, apenas classes do mesmo pacote ou da mesma hierarquia podem ter acesso
        System.out.println("Altura: " + p.altura);
        
        //O java reclama porque o atributo vivo é default, apenas classes do mesmo pacote podem ter acesso
        if(p.vivo == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morto");
        }
    }
    
    public void printSemErro(Pessoa p){
        System.out.println("Nome: " + p.nome);
        
        System.out.println("Senha: " + p.getSenha());
        
        //Usamos o Getter de altura para conseguirmos ver o conteudo do atributo altura, corrigindo a reclamação
        System.out.println("Altura: " + p.getAltura());
        
        if(p.isVivo() == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morto");
        }
    }
}
