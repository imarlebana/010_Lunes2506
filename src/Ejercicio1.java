import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 1 numero:" );
        String num1 = sc.next();
        System.out.println("Introduzca otro numero:" );
        String num2 = sc.next();



        try{
            int suma = Integer.valueOf(num1 ) + Integer.valueOf(num2);
            System.out.println("la suma es: " + suma);
        }catch (Exception e){
            System.out.println("Alguno de los parametros no son correctos: " + e.getMessage());
        }


    }
}

