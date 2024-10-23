/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k;

/**
 *
 * @author Talvez
 */
public class Cliente extends Pessoa{
    private int idCliente;

    public Cliente(int idCliente, String nome, String cpf) {
        super(nome, cpf);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    @Override
    public void print(){
        System.out.println("\nidCliente: " + getIdCliente());
        super.print();
    }
}
