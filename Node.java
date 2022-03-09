public class Node<E>{
    E val;
    Node<E> next;
    Node(){}
    Node(E val){
        this.val = val;
    }
    Node(E val, Node node){
        this.val = val;
        this.next = node;
    }
    public boolean hasNext(){
        return next!=null;
    }
}