/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author james
 */

enum SaborPalomitas{
    CHILE("Chile", 20.0f ),MANTEQUILLA("Mantequilla",30.0f),QUESO("Quesito",35.0f);
    
    private String nombreVenta;
    private float precio;
    
    private SaborPalomitas( String nombreVenta, float precio ){
        this.nombreVenta = nombreVenta;
        this.precio = precio;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public float getPrecio() {
        return precio;
    }
    
    

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }
    
    
    
}


public class EjemEnumeraciones {
    
    public static void main(String[] args) {
        SaborPalomitas queso = SaborPalomitas.QUESO;
        System.out.println( queso.name() );
        System.out.println( queso.getNombreVenta() );
        System.out.println( queso.getPrecio() );
    }
    
    
}
