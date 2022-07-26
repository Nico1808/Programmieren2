package Datastructures;

public class Queue<T> {
    Node<T> last;  

    class Node<T>{
        T data;
        Node<T> prev;

        public Node(T data){
            this.data = data;
            this.prev = null;
        }

        public Node<T> getPrev(){
            return prev;
        }

        public void setPrev(Node<T> newNode){
            this.prev = newNode;
        }

        public T getData(){
            return data;
        }
    }

    public void enqueue(T data){
        Node<T> newNode = new Node(data);
        if(last == null){
            last = newNode;
        }else{
            Node<T> current = last;
            while(current.getPrev() != null){
                current = current.getPrev();
            }
            current.setPrev(newNode);
        }
    }

    public T dequeue(){
        T output;
        output = last.getData();
        last = last.getPrev();
        return output;
    }
}
