public class SListIterator<E> {
    Node node;
    SListIterator(Node n){
        this.node = n;
    }

    public Node next(){
        node = node.next;
        return node;
    }

    public boolean hasNext(){
        return node.next != null;
    }

    public void insertNode(int val){
        node.next = new Node(val, node.next);
        node = node.next;
    }

    public void removeNode(){
        if(node.next != null){
            node.next = node.next.next;
        }
    }
}