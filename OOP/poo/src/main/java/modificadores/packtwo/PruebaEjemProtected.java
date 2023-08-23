/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadores.packtwo;

import modificadores.packone.EjemProtected;

/**
 *
 * @author james
 */
public class PruebaEjemProtected extends EjemProtected{
    void bar(){
        foo();
    }
    public static void main(String[] args) {
        PruebaEjemProtected e = new PruebaEjemProtected();
        e.bar();
        e.foo();
    }
    
}

