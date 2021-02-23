package uaslp.ingenieria.labs.list;

public class Node {
    private int dato;
    private Node previous;
    private Node Next;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
