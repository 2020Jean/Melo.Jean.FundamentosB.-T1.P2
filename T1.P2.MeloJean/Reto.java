import java.util.Scanner;

public class Reto {

    static  boolean  esArmstrong( int n ){

        int numero;
        int digitos;
        int digito;
        int suma;
        
        return false    ;

    }
    
    static int contarDigitos(int n){

        int contador = 0;
        int numero = n;

        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
    
    static int potencia(int b, int e){

        int resultado = 1;
        int i ;
        
        return resultado;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        boolean resultado = esArmstrong(numero);

        if (resultado) {
            System.out.println(numero + " es un número de Armstrong.");
        } else {
            System.out.println(numero + " no es un número de Armstrong.");
        }
        
        contarDigitos(numero);
        potencia(2, 3);

    }
 

}
