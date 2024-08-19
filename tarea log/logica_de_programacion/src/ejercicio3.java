import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[]args){
        Scanner Entrada=new Scanner(System.in);
        int A,B,C;
        System.out.println("ingreses el valor de A :");
        A=Entrada.nextInt();
        System.out.println("ingreses el valor de B :");
        B=Entrada.nextInt();
        System.out.println("ingreses el valor de C :");
        C=Entrada.nextInt();
        System.out.println("la suma es "+(A+B+C));
    }
}
