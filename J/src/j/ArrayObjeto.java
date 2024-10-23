/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j;

/**
 *
 * @author Talvez
 */
public class ArrayObjeto {
    
    Pessoa[] listaPessoas; //Criando oa array do tipo Pessoa, ou seja, ela irá armazenar Objetos da Classe Pessoa.
    
    private int contador; //O contador é importante para sabermos em qual posição do array nós nos encontramos

    public ArrayObjeto(int capMaxPessoas) {
        listaPessoas = new Pessoa[capMaxPessoas]; //Definindo o tamanho maximo do Array
        
        contador = 0;//Como o Array se inicia na posição 0, o contador tambem deve iniciar no 0
    }
    
    /*
    Adicionando Objetos no Array, método do tipo boolean para retornar se deu certo ou não, 
    porem o método poderia ter qualquer outro tipo de retorno
    */
    public boolean addPessoa(Pessoa p){ //Recebe um Objeto Pessoa em seu parametro
        
        //Caso o contador(Posição no array) for maior que o tamanho do Array, irá retornar false
        if(contador > listaPessoas.length) 
            return false;
        
        //Caso contrario, ele ira adicionar um Objeto Pessoa dentro da posição que o contador indica 
        listaPessoas[contador] = p;
        
        contador ++;
        /*
            Toda vez que um Objeto for adicionado no Array ele soma mais 1 ao valor do contador, 
            ou seja, se ele estava em 0 ele passa para 1 e assim por diante
        
            O contador++ deve estar abaixo da linha de codigo para adicionar o Objeto no Array, 
            caso contrario ele ira somar 1, anter de adicionar o Obejto, fazendo com que a posição 0
            do Array fique vazia.
        */
        return true;
    }
    
    public void print(){
        //Percorrendo as posições do Array
        /*
            Aqui usamos o contador e não o listaPessoas.lenght pois caso o Array seja maior que o número Objetos 
            contidos dentro dele, iremos percorrer posições vazias.
        */
        for(int i = 0; i < contador; i++){
        //Como listaPessoas armazena Objetos, nós conseguimos ter acesso aos Métodos e Atributos do Objeto indicado na posição
            listaPessoas[i].printFormato(); 
            //Usamos o Método printFormato do Objeto
        }
    }
    
}
