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
public class Boletin_13 {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        SeleccionFutbol equipo = new SeleccionFutbol();
        Xogador unXogador = new Xogador();
        Adestrador unAdestrador = new Adestrador();
        Masaxista unMasaxista = new Masaxista();
        
        unXogador.concentrarse();
        unAdestrador.concentrarse();
        unMasaxista.concentrarse();
        
        unXogador.viajar();
        unAdestrador.viajar();
        unMasaxista.viajar();
        //podese invocar un metodo da superclase con un obxeto dunha subclase
        //equipo.jugarPartido(); no se puede invocar un metodo da subclase con un obxeto do tipo da superclase
        
        
        /*
        System.out.println(unXogador.toString());
        System.out.println("\n"+unAdestrador.toString());
        System.out.println("\n"+unMasaxista.toString());
*/
    }
    
}
