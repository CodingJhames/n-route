/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author james
 */

class Animal{
    String nombre;
    public void respirar(){
            System.out.println("Soy un animal y estoy respirando");
    }
            
}

class Perro extends Animal{
    
}

class Gato extends Animal{
    
}



public class EjemploHerencia {
    
    public static void main(String[] args) {
        Animal a = new Animal();
        
        Perro p=new Perro();
        p.nombre = "Cacho";
        p.respirar();
        Gato g=new Gato();
        g.respirar();
    }
    
    
}
