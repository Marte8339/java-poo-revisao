/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k;

/**
 *
 * @author Talvez
 */
public class Array {
    private Pessoa[] listaPessoas; //add f1, tipo Pessoa, mas a classe Original dele ainda continua sendo Funcionario
    /*
        Criamos um Array para armazenar Objetos do tipo(classe) Pessoa, porem por ser uma Superclasse, 
        este array pode tembem armazenar Objetos de Subclasses da Superclasse, ou seja, por Pessoa ser 
        uma Superclasse este array pode armazenar objetos das Subclasses Cliente e Funcionario, porem 
        armazena com o mesmo "tipo" dos Objetos da Superclasse Pessoa.
    */
    private int count;
    
    public Array(int capMaxima) {
        listaPessoas = new Pessoa[capMaxima]; //Definimos a capacidade maxima da Array
        count = 0;
    }
    
    public boolean add(Pessoa p){ //Recebemos Objetos da classse pessoa no parametro, ou objetos da subclasses Cliente e Funcionario
        if(count > listaPessoas.length)
            return false;
        
        listaPessoas[count] = p; //Atribuimos(Colocamos) os Objetos na lista
        count++; // count = count + 1
        return true;
    }
    
    public void mostrandoLista(){
        for(int i = 0; i < count; i++){
            //Por Cliente e funcionarios serem Subclasses de Pessoa, eles tambem contem o método print()
            listaPessoas[i].print();
            //Algo muito importante a se firmar, é que, não é a lista que tem o método, mas sim os objetos dentro dela
        }
    }
    
    //Esta parte é mais simples do que aparenta
    public boolean filtrarFuncionario(int bonus){
        for(int i = 0; i < count; i++){ //Usamos para percorrer a lista
            
            //O instanceof traduzindo bem porcamente, seria, instancia de, simplificando, Objeto de.
            if(listaPessoas[i] instanceof Funcionario){ 
                /*
                Usamos o instanceof aqui, para resgatar somente os Objetos da Subclasse Funcionario, 
                lembrando que mesmo sendo Objetos da subclasse Funcionario eles ainda estão armazenados na 
                lista e por isso tem como "tipo" Pessoa
                */
                
                //Usamos Casting para forçarmos a troca de tipos, para Objetos é o mesmo esquema, porem com Objetos
                Funcionario f = (Funcionario)listaPessoas[i]; 
                /*
                Aqui "trocamos" o "tipo" do Objetos resgatado, ou seja, os Objetos que foram resgatados pelo 
                if(listaPessoas[i] instanceof Funcionario) logo acima, sofreram uma troca de "tipo" pelo (Funcionario), 
                e iram passar do "tipo" Pessoa para o "tipo" Funcionario.
                
                Podendo assim realizar métodos presentes da Classe Funcionario, como por exemplo calSal(bonus) 
                aonde somamos um bonus ao atributo salario
                */
                f.calSal(bonus);
                f.print();
                //Basicamente fizamos isto para que todos os Funcionario presentes na lista recebam um bonus passado na parametro deste método
            }
        }
        return true;
    }
    
    //Este método faz exatamente a mesma coisa que o outro, porem com ele conseguimos selecionar qual funcionario vai receber o bonus
    public boolean filtrarFuncionario(int index, int bonus){ //Recebemos index para selecionar a posição da lista
  
        //Por estarmos buscando uma posição especifica na lista, não existe a necessidade de percorrela 
        if(listaPessoas[index] instanceof Funcionario){

            Funcionario f = (Funcionario)listaPessoas[index]; //Selecionamos a posição da lista e fazemos com que somente este funcionario receba um bonus
            f.calSal(bonus);
            f.print();
            
            return true;
        }
        return false;
    }
}
