package Datastructures;

public class BinaryTree<T> {
    public Node<T> root = null;
    public int size = 0;

    class Node<T>{
        Node<T> leftNode;
        Node<T> rightNode;
        T data;

        public Node(T data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

        public void setLeftNode(Node<T> newNode){
            this.leftNode = newNode;
        }

        public void setRigthNode(Node<T> newNode){
            this.rightNode = newNode;
        }

        public Node<T> getLeftNode(){
            return leftNode;
        }

        public Node<T> getRightNode(){
            return rightNode;
        }

        public T getData(){
            return data;
        }
    }

    public boolean add(T data){
        Node<T> newNode = new Node(data);
        if(root==null){
            this.root = newNode;
            size++;
            return true;
        }
        return add(newNode, root);
    }

    private boolean add(Node<T> newNode, Node<T> current){
        int comparetoResult = ((Comparable)current.getData()).compareTo(newNode.getData());
        if(comparetoResult>0){
            //left
            if(current.getLeftNode() == null){
                current.setLeftNode(newNode);
                size++;
            }else{
                return add(newNode, current.getLeftNode());
            }
        }
        if(comparetoResult<0){
            //right
            if(current.getRightNode() == null){
                current.setRigthNode(newNode);
                size++;
            }else{
                return add(newNode, current.getRightNode());
            }
        }
        return false;
    }
    //in order traversal
    public void printInOrder(){
        if(root == null){
            System.out.println("Tree is empty!");
            return;
        }
        System.out.println("Print InOrder:");
        printInOrder(root);
    }

    private void printInOrder(Node<T> current){

        if(current.getLeftNode() != null){
            printInOrder(current.getLeftNode());
        }

        System.out.println(current.getData());

        if(current.getRightNode() != null){
            printInOrder(current.getRightNode());
        }
    }

    //Pre order traversal
    public void printPreOrder(){
        if(root == null){
            System.out.println("Tree is empty!");
            return;
        }
        System.out.println("Print PreOrder:");
        printPreOrder(root);
    }

    private void printPreOrder(Node<T> current){
        System.out.println(current.getData());
        if(current.getLeftNode() != null){
            printPreOrder(current.getLeftNode());
        }
        if(current.getRightNode() != null){
            printPreOrder(current.getRightNode());
        }
    }

    //post order traversal
    public void printPostOrder(){
        if(root == null){
            System.out.println("Tree is empty!");
            return;
        }
        System.out.println("Print PostOrder:");
        printPostOrder(root);
    }

    private void printPostOrder(Node<T> current){
        if(current.getLeftNode() != null){
            printPostOrder(current.getLeftNode());
        }
        if(current.getRightNode() != null){
            printPostOrder(current.getRightNode());
        }
        System.out.println(current.getData());
    }
}
