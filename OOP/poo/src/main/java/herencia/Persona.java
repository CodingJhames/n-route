/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author james
 */
public class Persona {
    
    String nombre;
    String fechaDeNacimiento;

    Persona(String nombre, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
    
    void dormir(){
        System.out.println("Soy "+nombre+" y estoy durmiendo");
    };
    
    void respirar(){
        System.out.println("Soy "+nombre+" y estoy respirando desde "+fechaDeNacimiento);
    };
    
    void comer(){
        System.out.println("Soy "+nombre+" y estoy comiendo");
    };
    
    
}
