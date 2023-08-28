/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author james
 */
public class EjemArrMultiDim {
    
    public static void main(String[] args) {
        int array[][] = new int[2][2];
        array[0][0] = 20;
        array[0][1] = 25;
        array[1][0] = 40;
        array[1][1] = 45;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            System.out.println(array[i][j]);
                
            }
        }
        
    }
    
    
}
