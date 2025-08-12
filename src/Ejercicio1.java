import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        double[] calificacionesAlumno = new double[4];
        
        Scanner in = new Scanner(System.in);

        pedirCalificacion("Calculo Diferencial", 1);
        calificacionesAlumno[0] = in.nextDouble();

        pedirCalificacion("Probabilidad y Estadistica", 2);
        calificacionesAlumno[1] = in.nextDouble();

        pedirCalificacion("Programacion Estructurada", 3);
        calificacionesAlumno[2] = in.nextDouble();

        pedirCalificacion("Sistemas Operativos", 4);
        calificacionesAlumno[3] = in.nextDouble();

        //Imprimiendo calificaciones
        System.out.println("Calificacion en Calculo diferencial: " + calificacionesAlumno[0]);
        System.out.println("Calificacion en Probabilidad y Estadistica: " + calificacionesAlumno[1]);
        System.out.println("Calificacion en Programacion Estructurada: " + calificacionesAlumno[2]);
        System.out.println("Calificacion en Sistemas Operativos: " + calificacionesAlumno[3]);

        System.out.println("Calificacion maxima --> " + tomarCalificacionMaxima(calificacionesAlumno));
        System.out.println("Calificacion minima --> " + tomarCalificacionMinima(calificacionesAlumno));


        in.close();



    }

    public static void pedirCalificacion(String materia, int num1) {
        System.out.println(num1 + ".Ingresa tu calificacion en " + materia + ":" );
    }

    public static double tomarCalificacionMaxima(double[] calificaciones) {
        double mayor = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > mayor) mayor = calificaciones[i];
        }
        return mayor;
    }

    public static double tomarCalificacionMinima(double[] calificaciones) {
        double menor = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] < menor) menor = calificaciones[i];
        }
        return menor;
    }

}
