/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statics;

/**
 *
 * @author james
 */

class Humano {
    static int numeroHumanos = 0;
    public Humano(){
        numeroHumanos++;
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
