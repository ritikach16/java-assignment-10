public class SList<E> {
    public Node<E> head = new Node<E>();
    public String toString(){
        SListIterator<E> it = iterator();
        StringBuilder str = new StringBuilder("{");
        while(it.hasNext()){
            str.append(it.next().toString());
            if(it.hasNext()){
                str.append(",");
            }
        }

        str.append("}");

        return str.toString();
    }

    public SListIterator<E> iterator(){
        return new SListIterator<E>(head);
    }
}