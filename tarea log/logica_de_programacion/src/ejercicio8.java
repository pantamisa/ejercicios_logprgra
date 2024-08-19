import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[]args){
        Scanner ingre=new Scanner(System.in);
        int edad;
        String genero;
        System.out.println("ingrese su genero");
        genero=ingre.nextLine();
        System.out.println("ingrese su edad");
        edad=ingre.nextInt();
        if (genero.equals("hombre")||genero.equals("mujer") ){
            if(!(edad<18)){
                System.out.println("puede ingresar");
            }else{
                System.out.println("no puede ingresar por menor de edad");
            }
        }else{
            System.out.println("ingreso invalido");
        }

              
    }
}
