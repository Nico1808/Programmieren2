package Datastructures;

public class runenviroment {
    public static void main(String[] args) {

        Queue<String> q = new Queue();

        q.enqueue("item1");
        q.enqueue("item2");
        q.enqueue("item3");

        System.out.println(q.dequeue());
        
    }
}
