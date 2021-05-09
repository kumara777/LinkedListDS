package ds.linkedlist;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        System.out.println(sLL.empty()); //1   ==> true
        System.out.println(sLL.contains(12)); //2 ==> false
        sLL.clear(); //3
        System.out.println(sLL.size()); //4 ==> 0
        sLL.print(); //5 ==> []
     //   sLL.get(4); //6 java.lang.RuntimeException: Singly Linked List is empty
        sLL.remove(0);//7
        sLL.add(5); //8
        System.out.println(sLL.size()); //9  ==> 1
        sLL.add(23); //10 ==>
        sLL.print(); //11 ==> [5, 23]
        System.out.println(sLL.size()); //12  ==> 2
    }

}
