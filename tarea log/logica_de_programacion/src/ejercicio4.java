
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[]args ){
        Scanner ingre=new Scanner (System.in);
        int edad;
        System.out.println("ingrese la edad");
        edad=ingre.nextInt();
        if (edad>18){
            System.out.println("Eres Mayor De Edad");
        }else{
            System.out.println("Eres Menor De Edad");
        }
        
    }
    
}
