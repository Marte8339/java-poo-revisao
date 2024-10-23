/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i;

/**
 *
 * @author Talvez
 */
public class CopyConstrutor {
    private String nome;
    private String rg;
    private String concatenado;

    public CopyConstrutor(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }
    
    //Criando outro construtor que recebe em seu parametro um Objeto da classe CopyConstrutor(Classe Original)
    public CopyConstrutor(CopyConstrutor cc) {
        this.nome = cc.getNome();
        this.rg = cc.getRg();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getConcatenado() {
        return concatenado;
    }
    public void setConcatenado(String concatenado) {
        this.concatenado = concatenado;
    }
    
    public String concaternar(){
        return concatenado = "Nome: " + getNome() + " RG: " + getRg();
    }
    
    public void print(){
        System.out.println("Nome: " + getNome());
        System.out.println("Rg: " + getRg());
        System.out.println(getConcatenado());
    }
    
}
