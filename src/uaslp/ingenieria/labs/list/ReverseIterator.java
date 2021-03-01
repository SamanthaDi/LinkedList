package uaslp.ingenieria.labs.list;

/**
 * va a iterar la liasta de atras hacia adelante
 */

public class ReverseIterator {

    private Node finalNode;

    public ReverseIterator(Node finalNode) {
        this.finalNode = finalNode;
    }

    public ReverseIterator(ReverseIterator ReverseIterador){
        finalNode = ReverseIterador.finalNode;
    }

    public boolean hasNext() {
        return finalNode != null;
    }

    public int previous(){

        int data = finalNode.getDato();
        finalNode = finalNode.getPrevious();

        return data;
    }

    Node getFinalNode() {  //cuando no ponemos modificador de acceso se llama package private
        return finalNode;
    }

}
