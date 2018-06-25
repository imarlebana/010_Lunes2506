import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        while(notas.size()<5){
            System.out.println("Introduce una nota:");
            notas.add(sc.nextDouble());
        }

        double total = 0;
        for(double nota : notas){
            total +=nota;

        }

        double media = total/notas.size();
        System.out.println("la media es: " + media);


    }
}
