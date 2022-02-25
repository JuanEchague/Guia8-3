
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Main {

    
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        AlumnoService alumnos = new AlumnoService();        
        String aux="";
        Alumno unAlumno = new Alumno();
        do{
            
            alumnos.ingresarNombreYNotas();
            System.out.print("Quiere agregar otro alumno? S/N: ");
            aux = read.next();
        } while (aux.equalsIgnoreCase("s"));
        System.out.println("Es Hora de saber la nota final");
        aux="";
        do{
            unAlumno = alumnos.ingresarNombre();
            System.out.print("Quiere buscar otro alumno? S/N: ");
            aux = read.next();
        } while(aux.equalsIgnoreCase("s"));
        alumnos.imprimirLista();
    
    }
    
}
