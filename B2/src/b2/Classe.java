/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

/**
 *
 * @author Talvez
 */
public class Classe extends Object{ //Clicando com a rodinha do mouse em Object abriremos a Classe Object
    private int numUM;
    private double numDOIS, resultado;
    

    public Classe(int numUM, double numDOIS) {
        this.numUM = numUM;
        this.numDOIS = numDOIS;
    }

    public int getNumUM() {
        return numUM;
    }
    public void setNumUM(int numUM) {
        this.numUM = numUM;
    }
    public double getNumDOIS() {
        return numDOIS;
    }
    public void setNumDOIS(double numDOIS) {
        this.numDOIS = numDOIS;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double soma(){
    
    return resultado = (double)getNumUM() + getNumDOIS();
    }
    
    //O toString é um método da classe Object, podemos utilizalo para convertermos as coisas em String
    @Override
    public String toString(){
        return "Resultado da soma de " + getNumUM() + " + " + getNumDOIS() + " = " + getResultado(); 
    }
    
    public void print(){
        System.out.println(toString());
    }
}
