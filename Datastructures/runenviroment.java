package Datastructures;

public class runenviroment {
    public static void main(String[] args) {

        BinaryTree<Integer> b = new BinaryTree<>();

        b.add(5);
        b.add(3);
        b.add(10);
        b.add(1);
        b.add(15);
        b.add(4);
        b.add(8);
        b.printPreOrder();
        b.printInOrder();
        b.printPostOrder();
    }
}
