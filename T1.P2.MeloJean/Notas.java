
import java.util.Scanner;

public class Notas {

    
    static double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    
    static String estado(double nota) {
        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    
    static double necesitaEnSupletorio(double nota) {
        return 28 - nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la  nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese la  nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Ingrese la  nota 3: ");
        double n3 = sc.nextDouble();

        promedio(n1, n2, n3);
        necesitaEnSupletorio(promedio(n1, n2, n3));
        estado (promedio(n1, n2, n3));

        System.out.printf("Promedio: %.2f%n", promedio(n1, n2, n3));
        System.out.println("Estado: " + estado(promedio(n1, n2, n3)));

         sc.close();
    }

   
}
