public class Geometria {
    static double volumenCubo (double lado) {

        double resultado;

        resultado = lado * lado * lado;
        return resultado;

    }

    static double volumenCilindro (double radio, double altura) {

        double resultado;

        resultado = Math.PI * radio * radio * altura;
        return resultado;
    }

    static double volumenPrismaRectangular(double largo, double ancho, double altura){
        double resultado;

        resultado = largo * ancho * altura;
        return resultado;
    }

    public static void main (String [] args) {

        System.out.println("Volumen del cubo: " + volumenCubo(5));
        System.out.println("Volumen del cilindro: " + volumenCilindro(3, 10));
        System.out.println("Volumen del prisma rectangular: " + volumenPrismaRectangular(4, 6, 8));

        volumenCubo(5);
        volumenCilindro(3, 10); 
        volumenPrismaRectangular(4, 6, 8);
        

    }
}
