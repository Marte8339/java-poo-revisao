/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g;

/**
 *
 * @author Talvez
 */
public class DataNasc {
    private int dia;
    private int mes;
    private int ano;

    public DataNasc(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void printData(){
        System.out.println( "Data de Nascimento" +
                            "\nDia: " + getDia() +
                            "\nMes: " + getMes() +
                            "\nAno: " + getAno());
    }
}
