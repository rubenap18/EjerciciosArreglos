import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nElementos, suma_mujeres=0;

        System.out.print("Ingrese la cantidad de personas: ");
        nElementos = entrada.nextInt();

        entrada.nextLine();

        String[] Personas = new String[nElementos];


        for(int i=0; i<Personas.length; i++){
            System.out.print("Ingrese el genero (Hombre/Mujer): ");
            Personas[i] = entrada.nextLine();

            if(Personas[i].equalsIgnoreCase("Mujer")){
                suma_mujeres++;
            }
        }

        System.out.println("Generos digitados: ");

        for(int i=0; i<Personas.length; i++){
            System.out.println(Personas[i]);
        }

        System.out.println("Cantidad de mujeres: "+suma_mujeres);

        entrada.close();
        
    }
}
