/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author james
 */
public class EjemploPersonas {
    
    public static void main(String[] args) {
        Estudiante e= new Estudiante(4211993, "James", "21-04-1993" );
        
        e.dormir();
        e.aprobar();
        e.reprobar();
        
        Empleado a = new Empleado( 500000,"jhon","10-10-1991" );
        a.trabajar();
        a.cobrar();
    }
    
    
    
}
