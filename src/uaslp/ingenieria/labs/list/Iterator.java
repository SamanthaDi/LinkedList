package uaslp.ingenieria.labs.list;

public class Iterator {
    private Node currentNode;

    public Iterator(Node currentNode) {
        this.currentNode = currentNode;
    }

    public Iterator(Iterator Iterator){
        currentNode = Iterator.currentNode;
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public int next(){

        int data = currentNode.getDato();
        currentNode = currentNode.getNext();

        return data;
    }

     Node getCurrentNode() {  //cuando no ponemos modificador de acceso se llama package private
        return currentNode;
    }
}
