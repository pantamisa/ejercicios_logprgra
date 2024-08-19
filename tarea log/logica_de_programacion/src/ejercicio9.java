import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[]args){
        Scanner sme=new Scanner (System.in);
        System.out.println("ingrese el dia de la semana:");
        int Seman=sme.nextInt();
        if (Seman>7){
            System.out.println("numero invalido");
            return;
        }
        
        if (Seman==1){
            System.out.println("el Dia es el Lunes");
        }else if(Seman==2){
            System.out.println("el Dia es el Martes");
        }else if(Seman==3){
            System.out.println("el Dia es el Miercoles");
        }else if(Seman==4){
            System.out.println("el Dia es el Jueves");
        }else if(Seman==5){
            System.out.println("el Dia es el Viernes");
        }else if(Seman==6){
            System.out.println("el Dia es el Sabado");
        }else if(Seman==7){
            System.out.println("el Dia es el Domingo");
        }
    }
}
