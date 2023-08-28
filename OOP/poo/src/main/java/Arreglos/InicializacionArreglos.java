/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author james
 */




public class InicializacionArreglos {
    static void imprimirArreglo( String arreglo[]){
        for (String valor : arreglo) {
            System.out.println(valor);
        }
    }
    
    public static void main(String[] args) {
        //explicita
        String nombres[] = new String[2];
        
        nombres[0] = "james";
        nombres[1] = "parchita";
        
        //implicita
        String nombres_dos[] = {"james","parchita"};
        
        //anónima
        String nombres_tres[] = new String[] {"james","parchita"};
    }
}
