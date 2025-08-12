import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        nElementos = entrada.nextInt();
        
        int[] numeros = new int[nElementos];

        for (int i=0; i<nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        int mayor = numeros[0];

        for (int i=1; i<numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        int[] nuevoArreglo = new int[numeros.length + 2];
        nuevoArreglo[0] = mayor;

        for (int i=0; i<numeros.length; i++) {
            nuevoArreglo[i+1] = numeros[i];
        }
        nuevoArreglo[nuevoArreglo.length - 1] = mayor;
        
        System.out.println("\nArreglo original:");

        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        
        System.out.println("\nArreglo modificado:");
        for (int i=0; i<nuevoArreglo.length; i++) {
            System.out.println(nuevoArreglo[i]);
        }
        
        entrada.close();
    }
}