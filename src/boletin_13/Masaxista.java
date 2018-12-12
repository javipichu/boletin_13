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
public class Masaxista extends SeleccionFutbol {
    private String Titulacion;
    private int aniosExperiencia;

    //constructores
    
    public Masaxista() {
        super();
    }

    public Masaxista(int id, String nombre, String apellidos, int edad, String Titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.Titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    //setters

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
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

    public String getTitulacion() {
        return Titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
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
    
    public void darMasaje() {

    }

    @Override
    public String toString() {
        return "Masaxista:"+super.toString() + "\nTitulacion=" + Titulacion + "\naniosExperiencia=" + aniosExperiencia ;
    }

    public void viajar() {
        System.out.println("viaxa o masaxista"); 
    }
    
    
    
}