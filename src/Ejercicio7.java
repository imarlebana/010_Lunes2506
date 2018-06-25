import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {


        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        List<Double> precios = new ArrayList<>();

        do{
            try {
                System.out.println("Elija una opcion");
                System.out.println("1. Nuevo precio.");
                System.out.println("2. Precio medio.");
                System.out.println("3. Precio maximo.");
                System.out.println("4. Precio minimo.");
                System.out.println("5. Mostrar todos los precio");
                System.out.println("6. Salir");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Introduce nuevo precio:");
                        double nuevo = sc.nextDouble();
                        precios = addPrecio(precios,nuevo);
                        System.out.println("El precio ha sido añadido.");
                        break;
                    case 2:
                        if(precios.isEmpty()){
                            System.out.println("No hay precios.");
                            break;
                        }
                        System.out.println("El precio medio es " + getMedia(precios));
                        break;
                    case 3:
                        System.out.println("El precio maximo es " + getMax(precios));
                        break;
                    case 4:
                        System.out.println("El precio minimo es " + getMin(precios));
                        break;
                    case 5:
                        if(precios.isEmpty()){
                            System.out.println("No hay precios.");
                            break;
                        }
                        getprecios(precios);
                        break;
                    case 6:
                        System.out.println("ADIOS");
                        break;
                    default:
                        break;
                }

            }catch (Exception e){
                System.out.println("La opcion no es valida.");
                sc = new Scanner(System.in);

            }
        }while (opcion!=6);
    }

    //1
    private static List<Double> addPrecio(List<Double> precios,double precio){
        precios.add(precio);
        return precios;
    }

    //2
    private static double getMedia(List<Double> precios){
        double total = 0;
        for(double precio : precios){
           total += precio;
        }

        return (total/precios.size());
    }

    //3
    private static double getMin(List<Double> precios){
        double total = 0;
        for(double precio : precios){
            if (precio < total){
                total = precio;

            }
        }
        return total;
    }

    //4
    private static double getMax(List<Double> precios){
        double total = 0;
        for(double precio : precios){
            if (precio > total){
                total = precio;

            }
        }
        return total;
    }


    //5
    private static void getprecios(List<Double> precios){
        for(double precio : precios){
            System.out.println("- " + precio);
        }
    }
}
