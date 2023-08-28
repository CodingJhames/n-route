/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author james
 */

class Taco{

    
    private String sabor;
    private float precio;
    private boolean cebolla;
    private boolean cilantro;

    public Taco(String sabor, float precio, boolean cebolla, boolean cilantro) {
        this.sabor = sabor;
        this.precio = precio;
        this.cebolla = cebolla;
        this.cilantro = cilantro;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isCilantro() {
        return cilantro;
    }

    public void setCilantro(boolean cilantro) {
        this.cilantro = cilantro;
    }
    
}

public class ArregloObjetos {
    
    public static void main(String[] args) {
        Taco orden[] =  new Taco[3];
        orden[0] = new Taco( "Suadero",12.0f, true, true );
        orden[1] = new Taco( "Pastor",10.0f, true, true );
        orden[2] = new Taco( "Arrachera",20.0f, true, true );
        
        float cuenta = 0.0f;
        
        for (Taco taco : orden) {
            System.out.println(  "Sabor "+ taco.getSabor() );
            System.out.println(  "Sabor "+ taco.getPrecio() );
            System.out.println(  "Sabor "+ taco.isCebolla() );
            System.out.println(  "Sabor "+ taco.isCilantro() );
            System.out.println(  "\n" );
            cuenta += taco.getPrecio();
        }
        System.out.println("Monto total "+ cuenta);
    }
    
}
