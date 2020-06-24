/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Oneras
 */
public class LinkedList {

    public static class Person {

        private String firstname;
        private String lastname;
        private String address;
        private boolean Person;

        public Person previous;
        public Person next;

        public String getFirstname() {
            return this.firstname;
        }

        public String getLastname() {
            return this.lastname;

        }

        public String getaddress() {
            return this.address;

        }

        public void setFirstname(String firstnsme) {
            this.firstname = firstname;

        }

        public void setlastname(String lastname) {
            this.lastname = lastname;

        }

        public void setaddress(String address) {
            this.address = address;
        }

        public Person(String firstname, String lastname, String address) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
        }

        public String getData() {
            return this.firstname + " " + this.lastname + " " + this.address;

        }

    }

    class Node {

        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    Person head, tail = null;

    public void addNode(String firstname, String lastname, String address) {
        Person newNode = new Person(firstname, lastname, address);

        if (head == null) {

            head = tail = newNode;
            head.previous = null;
            tail.next = null;

        } else {

            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display() {
        Person current = head;
        if (head == null) {
            System.out.println("list is emty");
            return;
        }
        System.out.print("Nodes of doubly linked list:");
        while (current != null) {

            System.out.println(current.getData());
            current = current.next;
        }

    }

    public static void main(String[] args) {

        LinkedList dList = new LinkedList();

         dList.addNode("jomar", "sareno", "matina");
         dList.addNode("onyok","james","davao");
         dList.addNode("marikit","joy","davao");
         dList.addNode("jason","jay","davao");
         dList.addNode("mar","joy","davao");
         
         
         
         
         
        dList.display();

    }

}
