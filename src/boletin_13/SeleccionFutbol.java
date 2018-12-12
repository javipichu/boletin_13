/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_13;

/**
 *
 * @author jalvarezotero
 */
public class SeleccionFutbol {

    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;

    public SeleccionFutbol() {

    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
    }

    @Override
    public String toString() {
        return  "\nid=" + id + "\nNombre=" + Nombre + "\nApellidos=" + Apellidos + "\nEdad=" + Edad;
    }

    public void concentrarse() {
        System.out.println("concentrase a seleccion");
    }
    
    public void viajar() {
        System.out.println("viaxa a seleccion");
    }
}
/**/