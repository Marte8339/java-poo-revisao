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
public class Gerente extends Pessoa{

    public Gerente(String nome, int senha, double altura, boolean vivo) {
        super(nome, senha, altura, vivo);
    }
    
    public void printErro(){
        //Por ser uma Subclasse de Pessoa, não existe a necessidade de recebermos o Objeto de Pessoa
        
        System.out.println("Nome: " + nome);
        
        //O java reclama porque o atributo senha é privado, apenas a classe Pessoa pode ter acesso
        System.out.println("Senha: " + senha);
        
        System.out.println("Altura: " + altura);
        
        //O java reclama porque o atributo vivo é default, apenas classes do mesmo pacote podem ter acesso
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
        
        //Usamos o Getter de vivo para conseguirmos ver o conteudo do atributo vivo, corrigindo a reclamação
        //Como o atributo vivo é boolean o Java por padrão, coloca is ao criar o Getter, mas é a mesma coisa, muda apenas o nome
        if(isVivo() == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morto");
        }
    }
}
