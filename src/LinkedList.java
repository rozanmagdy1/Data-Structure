import java.util.ArrayList;
import java.util.Collections;

public class LinkedList {
    Node head;
    class Node{
        int value;
        Node next;

        Node(int data){
            value = data;
            next = null;
        }
    }

    LinkedList(){
        head = null;
    }

    void insertBeginning(int value){
        Node new_node = new Node(value);
        if(head == null) {
            head = new_node;
            return;
        }
        new_node.next = head; //determine next
        head = new_node; //update

    }

    void insertAfter(int value, Node prev){
        if (prev == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(value);
        new_node.next = prev.next; //determine next
        prev.next = new_node; //update
    }

    void insertEnd(int value){
        Node new_node = new Node(value);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new_node;
    }

    void deleteBeginning(){
        if(head == null)
            System.out.println("can't delete it is empty");
        head = head.next;

    }

    void deleteEnd(){
        if(head == null)
            System.out.println("can't delete it is empty");
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    void deleteAfter(Node prev){
        if (prev == null || prev.next == null)
            return;
        Node deleted_node = prev.next;
        prev.next = deleted_node.next;
        deleted_node.next = null; //to disconnect it

    }

    Boolean search(int key){
        Node current = head;
        while (current != null){
            if(current.value == key)
                return true;
            current = current.next;
        }
        return null;
    }

    void traversal(){
        Node current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    void sort(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(head == null)
            return;
        Node current = head;
        while (current.next != null){
            temp.add(current.value);
            current = current.next;
        }
        Collections.sort(temp);
        System.out.println("The sorted linked list is " + temp);
    }

}
