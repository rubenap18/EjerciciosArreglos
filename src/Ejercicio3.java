import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("-->Llenando Vector 1...");
        vector1 = pedirNumeros(vector1);
        System.out.println("-->Llenando Vector 2...");

        vector2 = pedirNumeros(vector2);
        vector3 = sumarVectores(vector1, vector2);

        System.out.println("Vector 1 + Vector 2 = Vector 3");
        imprimirVector(vector1); System.out.print(" + "); 
        imprimirVector(vector2); System.out.print(" = "); imprimirVector(vector3);
        System.out.println();



    }

    public static int[] pedirNumeros(int[] vector) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresa el elemento " + (i+1) + ": ");
            vector[i] = in.nextInt();
        }
        in.close();
        return vector;
    }

    public static int[] sumarVectores(int[] vector1, int[] vector2) {
        int[] vectorResultado = new int[5];
        for (int i = 0; i < vector1.length; i++) {
            vectorResultado[i] = vector1[i] + vector2[i];
        }
        return vectorResultado;
    } 

    public static void imprimirVector(int[] vector) {
        for (int i : vector) {
            System.out.print("[" + i + "]");
        }
    }
}
