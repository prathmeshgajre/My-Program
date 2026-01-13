package ExceptionHandling;


import java.util.HashMap;

public class CustomLinkedList {
    private Node head;

    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int data){
        if (head == null) return;

        if (head.data == data){
            head = head.next;
            return;
        }

        Node current = head;




    }

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(101,"rajesh");
        map.put(102,"bharat");
        map.put(101,"pratham");
        System.out.println(map);

        //Object
    }
}
