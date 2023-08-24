/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statics;

/**
 *
 * @author james
 */


class A {
    void foo(){
        System.out.println("Foo");
    }
}

class B extends A{
    void foo(){
        System.out.println("Foo dos");
    }
}


public class StaticPolimorfism {
    
    public static void main(String[] args) {
        A a = new B();
        a.foo();
    }
       
}
