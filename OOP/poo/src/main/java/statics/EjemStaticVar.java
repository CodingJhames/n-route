/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statics;

/**
 *
 * @author james
 */

class SerVivo{
    public SerVivo(){
        System.out.println("Constructor ser vivo");
    }
    
}


class Humano extends SerVivo{
    static int numeroHumanos = 0;
    String nombre;
    
    public Humano(){
        super();
        System.out.println("Constructor");
    }
    
    public Humano( String nombre ){
        System.out.println("Constructor Sobrecargado");
        this.nombre = nombre;
    }
    
    
    {
        System.out.println("Bloque Anónimo");
        numeroHumanos++;
    }
    
    {
        System.out.println("Bloque dos");
    }
    
    

}




public class EjemStaticVar {
    public static void main(String[] args) {
        System.out.println( Humano.numeroHumanos );
        new Humano();
        new Humano();
        new Humano();
        System.out.println( Humano.numeroHumanos );
    }
}

