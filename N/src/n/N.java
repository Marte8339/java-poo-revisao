/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n;

/**
 *
 * @author Talvez
 */
public class N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p= new Pessoa("Caique", -13);
        
        //Note que para chamar um método que pode criar uma nova Exceção Verificada precisamos o colocar em um try.
        try{
            p.verificaNome();
        }catch(NossaExcecaoVerificada nev){
            System.out.println(nev);
        }
        
        //Enquanto que para chamar um método que pode criar uma nova Exceção Não Verificada, não precisamos necessariamente
        p.verificaIdade();
        
        p.print();
    }
    
}
