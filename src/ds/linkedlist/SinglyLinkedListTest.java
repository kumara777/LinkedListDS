package ds.linkedlist;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        System.out.println(sLL.empty()); //1
        System.out.println(sLL.contains(12)); //2
        sLL.clear(); //3
        System.out.println(sLL.size()); //4
        sLL.print(); //5
    }

}
