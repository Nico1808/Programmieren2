package Datastructures;

import java.security.DrbgParameters.NextBytes;

public class DoubleLinkedList<T> {
    Node<T> firstNode;
    Node<T> lastNode;

    class Node<T>{
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public void setNext(Node<T> next){
            this.next = next; 
        }
        
        public void setPrev(Node<T> prev){
            this.prev = prev;
        }

        public Node<T> getNextNode(){
            return next;
        }

        public T getData(){
            return data;
        }

        public Node<T> getPrev(){
            return prev;
        }
    }

    public void add(T data){
        Node<T> newNode = new Node(data);
        if(firstNode == null){
            firstNode = newNode;
            lastNode = firstNode;
        }else{
            Node<T> current = lastNode;
            current.setNext(newNode);
            current.getNextNode().setPrev(lastNode);
            lastNode = newNode;
        }
    }

    public void printList(){
        Node<T> current = firstNode;
        if(current.getNextNode().equals(null)){
            System.out.println("Die liste ist leider Leer!");
        }else{
            while(current != null){
                System.out.println(current.getData() + "\n");
                current = current.getNextNode();
            }
        }
    }

    public boolean remove(T data){
        if(firstNode.getData().equals(data)){
            if(firstNode.equals(lastNode)){
                firstNode = firstNode.getNextNode();
                lastNode = null;
            }
            return true;
        }
            Node<T> current = firstNode.getNextNode();
            while(current.getNextNode() != null){
                if(current.getData().equals(data)){
                    current.getPrev().setNext(current.getNextNode());
                    current.getNextNode().setPrev(current.getPrev());
                    return true;
                }
                current = current.getNextNode();
            }
            if(current.getData().equals(data)){
                current.getPrev().setNext(current.getNextNode());
                return true;
            }
            return false;
    }

    public boolean contains(T data){

        Node<T> current = firstNode;
        while(current.getNextNode() != null){
            if(current.getData().equals(data)){
                return true;
            }
            current = current.getNextNode();
        }
        if(current.getData().equals(data)){
            return true;
        }
        return false;
    }

}
