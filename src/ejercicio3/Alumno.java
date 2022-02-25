package ejercicio3;

import java.util.ArrayList;


/**
 *
 * @author dark_
 */
public class Alumno {

    /////////////////////////////Atributes/////////////////////////////////////
    private String nombre;
    private ArrayList<Integer> notas;

    ////////////////////////////Constructors///////////////////////////////////////
    public Alumno(String name, ArrayList<Integer> notas) {
        this.nombre = name;
        this.notas = notas;
    }

    public Alumno() {
    }

    //////////////////////////////Getters and Setters//////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    /////////////////////////////Methods////////////////////////////////////////
 @Override
    public String toString() {
        return String.format("ALUMNO: (Nombre: %s, Notas: %d, %d, %d)", nombre,notas.get(0),notas.get(1),notas.get(2));
    }

}
