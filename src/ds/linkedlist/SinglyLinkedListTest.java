package ds.linkedlist;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        System.out.println("====1====");
        System.out.println(sLL.empty()); //1   ==> true
        System.out.println(sLL.contains(12)); //2 ==> false
        sLL.clear(); //3
        System.out.println(sLL.size()); //4 ==> 0
        sLL.print(); //5 ==> []
        System.out.println("====2====");
     //   sLL.get(4); //6 java.lang.RuntimeException: Singly Linked List is empty
        sLL.remove(0);//7
        sLL.add(5); //8
        System.out.println(sLL.size()); //9  ==> 1
        sLL.add(23); //10 ==>
        sLL.print(); //11 ==> [5, 23]
        System.out.println(sLL.size()); //12  ==> 2
        System.out.println("====3====");
        sLL.remove(1);//13
        sLL.print(); //14 ==> [5]
        sLL.add(15); //15
        sLL.add(55); //15 ==>
        sLL.add(33); //15 ==>
        sLL.print(); //16 ==>    [5, 23, 15, 55, 33]
        System.out.println(sLL.size()); //17  ==> 5
        System.out.println("====4====");
        sLL.add(2,66); //18
        sLL.print(); //19 ==>    [5, 23, 66, 15, 55, 33]
        System.out.println(sLL.get(2));//20 ==> 15
        System.out.println("====5====");
        sLL.remove(1);//21 ==>
        sLL.print(); // 22 ==>    [5, 66, 15, 55, 33]
        System.out.println(sLL.contains(12)); //23 ==> false
        System.out.println(sLL.contains(15)); //23 ==> true
        sLL.clear(); //24
        System.out.println(sLL.size()); //25 ==> 0
    }

}
