
import java.util.Scanner;

public class ejercicio6 {
   
    public static void main(String[] args){
        Scanner lec=new Scanner (System.in);
        int num;
        System.out.println("ingrese un numero");
        num=lec.nextInt();
        if (num%2 == 0 ){
            System.out.println("el numero "+num+" es par");
        }else{
            System.out.println("el numero "+num+" es impar");
        }
        
    }
    
}
