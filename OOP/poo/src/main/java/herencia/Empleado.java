/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author james
 */
public class Empleado extends Persona {
    float sueldo;

    public Empleado( float sueldo, String nombre, String fechaDeNacimiento) {
        super(nombre, fechaDeNacimiento);
        this.sueldo = sueldo;
    }
    
    void trabajar(){
        System.out.println("Soy "+nombre+" y trabajo");
    }
    
    void cobrar(){
        System.out.println("Soy "+nombre+" y estoy cobrando " + sueldo);
    }
}
