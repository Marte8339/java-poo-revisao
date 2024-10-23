/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package h;

/**
 *
 * @author Talvez
 */
public class H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Fernanda"); //Instanciamos a Superclasse pessoa (Criamos um objeto da classe pessoa)
        
        Funcionario f1 = new Funcionario(0, "Caique"); //Instanciamos a Subclasse funcionario (Criamos um objeto da classe funcionario)
        
        Cadastrar c = new Cadastrar(); //instanciamos a classe Cadastrar
        
        /*
            Utilizamos o objeto da classe cadastrar, para instanciar a Subclasse Funcionario
            (Criando um novo objeto da classe funcionario) dentro do parametro do método passamos 
            o Objeto da Classe pessoa, podemos fazer isso pois, Funcionario é uma estensão de Pessoa
            em outras palavras como Funcionario é uma Subclasse de Pessoa, ele possui todos os atributos 
            necessarios para que isso ocorra.
        */
        Funcionario f2 = c.cadastrarFuncionario(1, p1);
        
        System.out.println("Pessoa: " + p1.getNome());
        System.out.println("Funcionario: " + f1.getNome() + " Id: " + f1.getIdFuncionario());
        System.out.println("Funcionario Cadastrado: " + f2.getNome() + " Id: " + f2.getIdFuncionario());
    }
    
}
