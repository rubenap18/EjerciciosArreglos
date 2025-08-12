import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nElementos, suma_votantes=0;

        System.out.print("Digite la cantidad de edades: ");
        nElementos = entrada.nextInt();

        int[] Edades = new int[nElementos];

        for(int i=0; i<Edades.length; i++){
            System.out.print((i+1)+". Ingrese la edad: ");
            Edades[i] = entrada.nextInt();

            if(Edades[i]>=18){
                suma_votantes++;
            }
        }

        System.out.println("Edades digitadas:");
        for(int i=0; i<Edades.length; i++){
            System.out.println(Edades[i]);
        }

        System.out.print("Personas que pueden votar: "+suma_votantes);

        entrada.close();

    }
}
