/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author salak402
 */
public class ejercicio5 {
    
    public static void main(String[]args){
        Scanner genero=new Scanner(System.in);
        String SEXO;
        System.out.println("Ingrese su genero");
        SEXO=genero.nextLine();
        if (SEXO.equals("hombre")){
            System.out.println("Es un Hombre");
        }else if (SEXO.equals("mujer")){
            System.out.println("Es una Muejer");
        }else {
             System.out.println("ingreso invalido");
        }
    }
    
}
