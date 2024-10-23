/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k;

/**
 *
 * @author Talvez
 */
public class Funcionario extends Pessoa{
    private int idFuncionario;
    private int salario;

    public Funcionario(int idFuncionario, String nome, String cpf, int salario) {
        super(nome, cpf);
        this.idFuncionario = idFuncionario;
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public int calSal(int bonus){
        //return salario = bonus + salario
        return salario += bonus;
    }
    
    @Override
    public void print(){
        System.out.println("\nIdFuncionario: " + getIdFuncionario());
        super.print();
        System.out.println("Salario: " + getSalario());
    }
}
