package Datastructures;

public class List<T>{
    Node<T> firstNode;
    Node<T> lastNode;
    int size = 0;

    class Node<T>{
        T data;
        Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNextNode(){
            return next;
        }

        public T getData(){
            return data;
        }
    }

    public void add(T data){

        Node<T> newNode = new Node(data);

        if(firstNode == null){
            firstNode = newNode;
            lastNode = firstNode;
        }

        lastNode.setNext(newNode);
        lastNode = newNode;
        size++;
    }

    public Node<T> getFirst(){
        return firstNode;
    }

    public Node<T> getLast(){
        return lastNode;
    }

    public boolean contains(T data){

        Node<T> current = firstNode;

        while(current != null){
            if(current.getData() == data){
                return true;
            }
            current = current.getNextNode();
        }

        return false;
    }

    public boolean remove(T data){
        
        if(firstNode.getData().equals(data)){
            if(firstNode == lastNode){
                lastNode = null;
            }
            
            firstNode = firstNode.getNextNode();
            size--;
            return true;
        }
        
        Node<T> current = firstNode;
        while(current.getNextNode() != null){
            if(current.getNextNode().getData().equals(data)){
                if(current.getNextNode() == lastNode){
                    lastNode = current;
                }else{
                    current.setNext(current.getNextNode().getNextNode());
                    size--;
                    return true;
                }
            }
        
        }
        return false;
    }

    public void printList(){
        Node<T> current = firstNode;

        if(current == null){
            System.out.println("Die Liste ist Leer!");
        }else{
            while(current != null){
                System.out.println(current.getData() + "\n");
                current = current.getNextNode();
            }
        }

    }

    public T find(int i){
        Node<T> current = firstNode;
        for(int j = 0; j<i; j++){
            current = current.getNextNode();
        }
        return current.getData();
        
    }

    

}