public class MainClass {
    public static void main(String[] args) {
        SList<Integer> obj = new SList<>();
        SListIterator<Integer> it = obj.iterator();
        System.out.println(obj);
        it.insertNode(1);
        it.insertNode(2);
        it.insertNode(3);
        System.out.println(obj);
    }
}