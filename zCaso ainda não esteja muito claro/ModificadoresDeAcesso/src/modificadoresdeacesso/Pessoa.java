/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadoresdeacesso;

import modificadoresdeacesso.novopackage.*;

/**
 *
 * @author Talvez
 */
public class Pessoa {
    public String nome;
    private int senha;
    protected double altura;
    boolean vivo;

    public Pessoa(String nome, int senha, double altura, boolean vivo) {
        this.nome = nome;
        this.senha = senha;
        this.altura = altura;
        this.vivo = vivo;
    }
    
    //Como o atributo nome é publico não existe necessidade de fazermos um set e um get para ele
    
    //Setter e Getter do atributo senha
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    //Setter e Getter do atributo altura
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Setter e Getter do atributo vivo
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
}
