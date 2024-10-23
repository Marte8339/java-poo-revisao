/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modificadoresdeacesso;

//Utilizamos o import, para importar arquivos de outro pacote, seja classe, interface e etc...
//      import Nome do pacote.Nome do que você quer importar ou * que importa tudo que está no pacote
import modificadoresdeacesso.novopackage.*;
//Neste caso import modificadoresdeacesso.novopackage(Nome do pacote).*(* Porque quero importar tudo);

/**
 *
 * @author Talvez
 */
public class ModificadoresDeAcesso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Neste projeto temos a classe Pessoa que contem atribuos com diferentes 
            tipos de modificadores de acesso. Sendo eles: 
        
                nome com o modificador public

                senha com o modificador private

                altura com o modificador protected

                vivo com o modificador default
        
            Temos tambem algumas classes tentando ter acesso a estes atributos, e 
            tentando nos mostrar com o método print() criado em cada uma. Sendo elas:
        
                Cliente está no mesmo pacote, não é Subclasse de Pessoa
        
                Funcionario está no mesmo pacote, é Subclasse de Pessoa
        
                CEO está em um pacote diferente, não é Subclasse de Pessoa
        
                Gerente está em um pacote diferente, é Subclasse de Pessoa
        */
        
        Pessoa p = new Pessoa("Caique", 12345, 1.75, true);
        
        //Para exibir corretamente coloque printErro() em comentario tanto aqui na main, quanto nas classes.
        //E retire printSemErro() do comentario
        
        //Mesmo pacote
        Cliente c = new Cliente();
        
        c.printErro(p); //Recebe o objeto de Pessoa que criamos logo acima
        
        //c.printSemErro(p);
        
        System.out.println("--------------------------------");
        
        Funcionario f = new Funcionario("Caique", 12345, 1.75, true); //Subclasse de Pessoa
        
        f.printErro();
        
        //f.printSemErro();
        
        System.out.println("--------------------------------");
        
        //pacote diferente
        CEO o = new CEO();
        
        o.printErro(p); //Recebe o objeto de Pessoa que criamos logo acima
        
        //o.printSemErro(p);
        
        System.out.println("--------------------------------");
        
        Gerente g = new Gerente("Caique", 12345, 1.75, true); //Subclasse de Pessoa
        
        g.printErro();
        
        //g.printSemErro();
        
    }
    
}
