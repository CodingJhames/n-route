/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author james
 */
public class Estudiante extends Persona {
    
    int numeroDeCuenta;
    
    Estudiante( int numeroDeCuenta, String nombre, String fechaDeNacimiento ){
        super( nombre, fechaDeNacimiento );
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    @Override
    void dormir(){
        super.dormir();
        System.out.println("Soy "+nombre+" soy Estudiante, yo no duermo");
    }
    
    
    void aprobar(){
        System.out.println("Soy "+nombre+" y aprobé el examen");
    }
    
    void reprobar(){
        System.out.println("Soy "+nombre+" y reprobé el examen");
    }
    
}
