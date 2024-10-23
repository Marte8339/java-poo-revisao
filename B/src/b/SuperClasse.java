/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

/**
 *
 * @author Talvez
 */
public class SuperClasse {
    private String heranca;
    private int dividaAtual;
    private final int divida;
    
    //Os atributos no construtor da SuperClasse vão ser passados para a SubClasse
    public SuperClasse(String heranca, int divida) {
        this.heranca = heranca;
        this.divida = divida; //A partir do momento em que um atributo final recebe um valor, ele não pode ser mais alterado.
    }
    
    //Getter e Setter dos atributos privados
    public String getHeranca() {
        return heranca;
    }
    public void setHeranca(String heranca) {
        this.heranca = heranca;
    }
    public int getDivida() {
        return divida;
    }
    public int getDividaAtual() {
        return dividaAtual;
    }
    public void setDividaAtual(int dividaAtual) {
        this.dividaAtual = dividaAtual;
    }
    
    public int pagarDivida(int quantidade){
        //Mesmo divida não podendo ser alterado ele ainda pode ser utilizado para calculos e etc.
        return dividaAtual = divida - quantidade;
    }
    
    public void foda(){
        System.out.println("Sua heranca: " + getHeranca() + "\nValor da divida: " + getDivida() 
                         + "\nSua divida atual: " + getDividaAtual());
    }
    
    //Por ser um método static, ele não pode ser chamado por um Objeto
    public static void carta(){
        System.out.println("A conta da sua Vida XD xD");
    }
    
    public void print(){
        
    }
}
