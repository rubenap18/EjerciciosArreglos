import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        //10 elementos desde el 0
        int[] elementos = new int[10];

        int temp = 0;
        int contador = 0;

        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Ingresa un numero para el elemento " + (i+1) + ":");
            temp = in.nextInt();
            if (temp < 0) break;
            elementos[contador++] = temp;
        }

        System.out.println("Numeros en el arreglo: ");
        imprimirVector(elementos,contador);

        in.close();

    }

    public static void imprimirVector(int[] arreglo, int hasta) {
        for (int i = 0; i < hasta; i++) {
            System.out.println("-->" + arreglo[i]);
        }
    }
}
