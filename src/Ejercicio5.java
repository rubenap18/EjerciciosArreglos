import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        int nElementos, suma_pares=0, suma_impares=0;

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        nElementos = entrada.nextInt();

        int[] Numeros = new int[nElementos];

        for(int i=0; i<Numeros.length ; i++){
            System.out.print((i+1)+". Digite un numero: ");
            Numeros[i] = entrada.nextInt();

            if(Numeros[i]%2 == 0){
                suma_pares ++;
            }
            else if(Numeros[i]%2 != 0){
                suma_impares ++;
            }
        }

        System.out.println("\nElementos del arreglo: ");

        for(int i=0; i<Numeros.length; i++){
            System.out.println(Numeros[i]);
        }

        System.out.print("Cantidad de numeros pares: "+suma_pares+"\n");
        System.out.print("Cantidad de numeros impares: "+suma_impares+"\n");

        entrada.close();

    }

}
