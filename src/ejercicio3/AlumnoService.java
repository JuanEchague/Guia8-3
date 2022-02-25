package ejercicio3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class AlumnoService {

    

    /////////////////////////////Atributos/////////////////////////////////////
    private ArrayList<Alumno> alumnos;
    
    //////////////////////////////Builders/////////////////////////////////////

    public AlumnoService() {
        alumnos = new ArrayList<Alumno>();
    }

    //////////////////////////////Methods///////////////////////////////////////

 

    public void crearAlumno(String nombre, ArrayList<Integer> notas) {
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setNotas(notas);
        agregarAlumno(alumno);

    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public Alumno buscarAlumno(String name) {
        Alumno alumnoReturn = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(name)) {
                alumnoReturn = alumno;
            }
        }
        return alumnoReturn;
    }

    public void ingresarNombreYNotas() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String nombre;
        ArrayList<Integer> notas = new ArrayList<>();
        
        int aux;
        
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = read.next();
        for (int i= 0; i<3;i++){
            System.out.printf("Ingrese la %dº nota: ",i+1);
            aux = read.nextInt();
            notas.add(aux);
        }
        crearAlumno(nombre,notas);
    }
   
    
    public Alumno ingresarNombre() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String nombre = read.next();
        Alumno alumno = buscarAlumno(nombre);
       
        if (alumno!= null) {
            System.out.printf("Nota final: %.2f \n",obtenerNotaFinal(alumno));
        }else {
            System.out.println("El alumno ingresado no esta registrado");
        }
        return alumno;
    }

    public double obtenerNotaFinal(Alumno alumno) {
        int acumulador = 0;
        for (Integer nota : alumno.getNotas()) {
            acumulador += nota;
        }
        return (double) acumulador / alumno.getNotas().size();
    }
    public void imprimirLista(){
        for (Alumno alumno: alumnos){
            System.out.println(alumno);
        }
    }

}
