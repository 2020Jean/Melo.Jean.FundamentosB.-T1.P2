import java.util.Scanner;

public class Planilla {

    static void leerConsumo(Scanner sc){

        double consumo;

        do {
            System.out.println("Ingrese el consumo: ");
            consumo = sc.nextDouble();

        } while (consumo < 0);

    }
   
    static double calcularValor(double m3){

        double valor;

        if (m3 <= 15){ 
            valor = m3 * 0.40;
        } else {
        valor = 15 * 0.40 + (m3 - 15) * 0.75;
        }

        return valor + 2.50;
    }

    

    static void mostrarPlantilla (double m3, double plantilla){

        System.out.println(" ------Plantilla Agua ------"); 
        System.out.println(" consumo m3: " + m3 + "m3");
        System.out.printf("Total a pagar: $%.2f%n", plantilla);


    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        leerConsumo(sc);
        double consumo = sc.nextDouble();
        double valor = calcularValor(consumo);
        mostrarPlantilla(consumo, valor);

        sc.close();
    }

}


