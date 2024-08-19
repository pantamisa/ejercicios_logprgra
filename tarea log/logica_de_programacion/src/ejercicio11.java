import java.util.Scanner;

public class ejercicio11 {
    
    public static void main(String[]args){
       Scanner aux= new Scanner (System.in);
       System.out.println("Ingrese su sexo para aplicar al Auxilio");
       String Sexo=aux.nextLine();
       if (!Sexo.equals("mujer")){
           System.out.println("no aplica ");
           return;
       }
       System.out.println("Ingrese su edad:");
       int edad=aux.nextInt();
       if (edad<18){
                  System.out.println("Ingrese su estrato:");
                  int Estrato=aux.nextInt();
           if (Estrato>=1 && Estrato<=3){
               System.out.println("Ingrese 1:SOlTERA 2:CASADA 3:VIUDA");
               int EstadoC=aux.nextInt();
               if (EstadoC==1){
                   System.out.println("Ingrese su numero de hijos :");
                   int hijos=aux.nextInt();
                  if (hijos==0){
                        System.out.println("Aplica para un auxilio de $300.000");
                    }else if(hijos>0){
                        System.out.println("Aplica para un auxilio de $500.000");
                    }
                            
                }else{
                   System.out.println("No aplica");
                   return;
               }
           }else{
               System.out.println("No aplica");
               return;
           }
               
       }else if(edad >18){
                  System.out.println("Ingrese su estrato:");
                   int Estrato=aux.nextInt();
           if (Estrato>=1 && Estrato<=3){
               System.out.println("Ingrese 1:SOlTERA 2:CASADA 3:VIUDA");
               int EstadoC=aux.nextInt();
               if (EstadoC==1){
                   System.out.println("Ingrese su numero de hijos :");
                   int hijos=aux.nextInt();
                  if (hijos==0){
                        System.out.println("Aplica para un auxilio de $400.000");
                    }else if(hijos>0){
                        System.out.println("Aplica para un auxilio de $600.000");
                    }
                            
                }else{
                   System.out.println("No aplica");
               }
           }else {
               System.out.println("No aplica");
               return;
           }
           
       }else{
           System.out.println("no valido:");
       }
         
    } 
}
