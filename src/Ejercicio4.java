import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        Scanner in = new Scanner(System.in);
        
        System.out.println("El promedio de los numeros del arreglo es de: " + promediarArreglo(pedirNumeros(numeros, in)));
        in.close();
    }

    public static double[] pedirNumeros(double[] vector, Scanner in) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresa un numero para el elemento " + (i+1) + ": ");
            vector[i] = in.nextDouble();
        }
        return vector;
    }

    public static double promediarArreglo(double[] arreglo) {
        double sumatoria = 0;
        for (double d : arreglo) {
            sumatoria += d;
        }

        return sumatoria/arreglo.length;
    }
}
