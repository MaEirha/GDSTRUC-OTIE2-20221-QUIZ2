package com.gdstruc.module2;

public class UlamLinkedList {
    private UlamNode head;
    private int size;

    public void indexOf(String name){
        UlamNode current = head;
        String currentName;
        int index = 0;

        do {
            current = current.getNextUlam();
            currentName = current.getUlamName();
            index++;

            if (current.getNextUlam() == null) {
                break;
            }

        } while (currentName != name);

        if (currentName == name) {
            System.out.println("The " + name + " is located at index " + index + ".");
        } else System.out.println("There is no " + name + " in the Menu.");
    }

    public void contains(String name) {
        UlamNode current = head;
        String currentName;

        do {
            current = current.getNextUlam();
            currentName = current.getUlamName();

            if (current.getNextUlam() == null) {
                break;
            }

        } while (currentName != name);

        if (currentName == name) {
            System.out.println("There is " + name + " in the Menu.");
        } else System.out.println("There is no " + name + " in the Menu.");
    }

    public void sizeCount(){
        UlamNode current = head;

        size = 0;

        do {
            size++;
            current = current.getNextUlam();
        }while (current != null);

        System.out.println("Total Size Count: ");
        System.out.println(size);
    }

    public void addToFront(Ulam ulam) {
        UlamNode ulamNode = new UlamNode(ulam);
        ulamNode.setNextUlam(head);
        head = ulamNode;
    }

    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD ->\n");
        UlamNode current = head;

        while (current != null) {
            System.out.print(current.getUlam() + " -> \n");
            current = current.getNextUlam();
        }

        System.out.print("NULL\n");
    }

    public void removeFirstUlam(){
        UlamNode current = head;
        head = current.getNextUlam();
    }
}