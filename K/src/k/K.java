/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package k;

/**
 *
 * @author Talvez
 */
public class K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Caique", "123.212.231-31");
        
        Funcionario fum = new Funcionario(4, "Geovana", "364.765.565-01", 1800);
        Funcionario fdois = new Funcionario(2, "Carlos", "093.324.243-02", 1100);
        
        Cliente c = new Cliente(1, "Ursola", "235.325.342-03");
        
        Array a = new Array(6);
        
        a.add(p);
        a.add(fum);
        a.add(fdois);
        a.add(c);
        
        a.mostrandoLista();
        
        System.out.println("----------");
        
        //Todos os Funcionarios recebem o bonus
        a.filtrarFuncionario(200);
        
        System.out.println("----------");
        
        //Somente um Funcionario recebe o bonus
        a.filtrarFuncionario(1, 200); //Funcionario de iD x, recebe bonus y
    }
    
}
