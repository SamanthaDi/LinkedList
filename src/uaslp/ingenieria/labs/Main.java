package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.ReverseIterator;



public class Main {

    public static void main(String[] args) {

        int after = LinkedList.AFTER;
        int before = LinkedList.BEFORE;

        LinkedList lista1 = new LinkedList();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);


        System.out.println("El tamaño es " + lista1.getSize());

        //int data = lista1.get(2);
        //System.out.println("El dato en 2 es:  " + data);

        for (int i = 0; i < lista1.getSize(); i++) {
            System.out.println("El dato en " + i + "es: " + lista1.get(i));
        }

        //System.out.println("-----------------------------");

        Iterator it = lista1.getIterator();
        ReverseIterator it2 = lista1.getReverseIterator();

        while(it.hasNext()){
            Iterator backupIt = new Iterator(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, LinkedList.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, LinkedList.AFTER, backupIt);
            }
        }

        System.out.println("-----------------------------");
        System.out.println("El tamaño es " + lista1.getSize());
        for (int i = 0; i < lista1.getSize(); i++) {
            System.out.println("El dato en " + i + "es: " + lista1.get(i));
        }

        lista1.delete(1);
        System.out.println("-----------------------------");
        System.out.println("El tamaño es " + lista1.getSize());

        for (int i = 0; i < lista1.getSize(); i++) {
            System.out.println("El dato en " + i + "es: " + lista1.get(i));
        }

        System.out.println("-----------------------------");

        it = lista1.getIterator();
        while(it.hasNext()){
            int element = it.next();

            System.out.println("dato: " + element);
        }

        System.out.println("-----------------------------");

        it2 = lista1.getReverseIterator();

        while(it2.hasNext()){
            int element = it2.previous();

            System.out.println("Dato: " + element);
        }

    }
}

//Clases: LinkedList, main, System
//Objetos:
//metodos add, getzise, main