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
public class Adestrador extends SeleccionFutbol {

    private String idFederacion;
    
    //constructores
    public Adestrador() {
        super();
    }

    public Adestrador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    //setters
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    //getters

    public String getIdFederacion() {
        return idFederacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }
    
    //otros

    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {

    }

    @Override
    public String toString() {
        return "Adestrador:" + super.toString() + "\nidFederacion=" + idFederacion;
    }

    public void viajar() {
        System.out.println("viaxa o adestrador"); 
    }
    
    
}
