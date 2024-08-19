import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[]args){
        Scanner lec=new Scanner(System.in);
        int A,B;
        System.out.println("ingrese numero uno:");
        A=lec.nextInt();
        System.out.println("ingrese numero dos:");
        B=lec.nextInt();
        if (A>B){
            System.out.println("el resultado es :"+A/B);
        }else if (B>A){
            System.out.println("el resultado es :"+B/A);
        }
    }
}
