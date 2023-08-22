package OOP;

class Persona {
    //atributes
    String nombre;
    int edad;
    char genero;

    void jugarVideojuegos( Persona p){
        System.out.println( nombre+" está jugando con: "+ p.nombre );
    }

    //methods
    void imprimirInfo(){
        System.out.println("Nombre:" + nombre );
        System.out.println("Edad: " + edad );
        System.out.println( "Genero: " + genero );
    }

    public static void main(String args[]) {
        Persona p = new Persona();
        p.nombre = "James";
        p.edad = 30;
        p.genero = 'M';
        p.imprimirInfo();

        Persona p_one = new Persona();
        p_one.nombre = "Parchita";
        p_one.edad = 4;
        p_one.genero = 'F';
        p_one.imprimirInfo();

        p.jugarVideojuegos(p_one);
    }

}


