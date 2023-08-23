/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author james
 */
public class Persona {
    
     //atributes
    String nombre;
    int edad;
    char genero;
    
    // constructor
    Persona(){
        System.out.println("constructor por defecto");
    }

    Persona(String nombre, int edad, char genero){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    //methods
    void jugarVideojuegos( Persona p){
        System.out.println( nombre+" está jugando con: "+ p.nombre );
    }

    
    void imprimirInfo(){
        System.out.println("Nombre:" + nombre );
        System.out.println("Edad: " + edad );
        System.out.println( "Genero: " + genero );
    }

    public static void main(String args[]) {
        Persona p = new Persona("James",30,'M');
        p.imprimirInfo();
        System.out.println();
        Persona p_one = new Persona("Parchita",4,'F');
        p_one.imprimirInfo();

        p.jugarVideojuegos(p_one);
    }
    
}
