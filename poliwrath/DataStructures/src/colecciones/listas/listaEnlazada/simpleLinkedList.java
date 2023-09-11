package colecciones.listas.listaEnlazada;

public class simpleLinkedList {
    private Node first; //referencia al primer nodo de la lista enlazada

    public simpleLinkedList(){
        this.first = null;
    }

    public void push( Object obj ){
        //Este nuevo nodo será la cabeza de la lisla enlazada simple
        Node newNode = new Node( obj );
        //Ahora el nuevo nodo creado es el primero (apunta primero a first y luego newNode es el nuevo first)
        newNode.setNext( this.first );
        this.first = newNode;
    }

    public Node pop(){
        Node temp = this.first;//Guarda referencia al primer nodo en la variable temp
        this.first = this.first.next();

        return temp;
    }

    public Node delete(Object val ){
        Node currentNode = this.first;
        Node previousNode = this.first;

        while (!currentNode.value().equals(val)){
            if ( currentNode.next() == null) {
                return null;
            }else {
                previousNode = currentNode;
                currentNode = currentNode.next();
            }
        }
    }
    
}
