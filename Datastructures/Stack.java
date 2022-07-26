package Datastructures;

public class Stack<T> {
    private Node<T> first;
    private Node<T> current;

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(first == null){
            first = newNode;
            current = newNode;
        }else{
            newNode.setPrevious(current);
            current = newNode;
        }
    }

    public T pop(){
        T data = current.getData();
        current = current.getPrevious();

        return data;

    }

    public T peek(){
        return current.getData();
    }

    private class Node<T>{
        T data;
        Node previous;

        Node(T data){
            this.data = data;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getPrevious(){
            return previous;
        }

        public T getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.add(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}