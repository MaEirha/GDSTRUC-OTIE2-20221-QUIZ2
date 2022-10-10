package com.gdstruc.module2;

public class Main {
    public static void main(String[] args) {
        /*
         * Using the LinkedList class, create a contains() and indexOf()  function similar to our ArrayList.
         */

        Ulam menudo = new Ulam(1, "Menudo", 1);
        Ulam mechado = new Ulam(2, "Mechado", 1);
        Ulam afritada = new Ulam(3, "Afritada", 1);
        Ulam caldereta = new Ulam(4, "Caldereta", 1);
        Ulam sinigang = new Ulam(5, "Sinigang", 0);

        UlamLinkedList ulamLinkedList = new UlamLinkedList();

        //Adding an Ulam
        ulamLinkedList.addToFront(menudo);
        ulamLinkedList.addToFront(mechado);
        ulamLinkedList.addToFront(afritada);
        ulamLinkedList.addToFront(caldereta);
        ulamLinkedList.addToFront(sinigang);

        System.out.println(" ");
        System.out.println("Ulam List: ");
        ulamLinkedList.printList();
        ulamLinkedList.sizeCount();

        //Removing the first Ulam
        ulamLinkedList.removeFirstUlam();

        System.out.println(" ");
        System.out.println("After Removing First Ulam: ");
        ulamLinkedList.printList();
        ulamLinkedList.sizeCount();

        //Removing the first Ulam
        ulamLinkedList.removeFirstUlam();

        System.out.println(" ");
        System.out.println("After Removing First Ulam: ");
        ulamLinkedList.printList();
        ulamLinkedList.sizeCount();

        //Adding another 2 Ulam
        System.out.println("\nAdding Dinuguan then Sinigang into the Menu.");
        Ulam dinuguan = new Ulam(6,"Dinuguan",0);
        ulamLinkedList.addToFront(dinuguan);
        ulamLinkedList.addToFront(sinigang);

        System.out.println(" ");
        System.out.println("Updated Ulam List: ");
        ulamLinkedList.printList();
        ulamLinkedList.sizeCount();

        // Searching for an item in the list
        System.out.println(" ");
        System.out.println("Looking for Menudo in the Menu: ");
        ulamLinkedList.contains("Menudo");

        // Searching for an item NOT in the list
        System.out.println(" ");
        System.out.println("Looking for Pinipig in the Menu: ");
        ulamLinkedList.contains("Pinipig");

        // Index Searching for an item in the List
        System.out.println(" ");
        System.out.println("Looking for the index of Mechado: ");
        ulamLinkedList.indexOf("Mechado");

        // Index Searching for an item NOT in the List
        System.out.println(" ");
        System.out.println("Looking for the index of Pinipig: ");
        ulamLinkedList.indexOf("Pinipig");

    }
}