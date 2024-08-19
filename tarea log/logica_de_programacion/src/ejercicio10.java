import java.util.Scanner;
public class ejercicio10 {
    
    public static void main(String[]args){
    Scanner hour=new Scanner (System.in);
    System.out.println("ingrese la hora militar:");
    int Horas=hour.nextInt();
    
    if(Horas>=0 && Horas<=600){
        System.out.println("es madrugada");
    }else if(Horas>=700 && Horas<=1200){
        System.out.println("buenos dias ");
    }else if (Horas>=1300 && Horas<=1800){
        System.out.println("Buenas tardes");
    }else if (Horas>=1900 && Horas<=2400){
        System.out.println("Buenas noches ");

    }else{
        System.out.println("Hora no valida");
    }
    
    
    }
}
