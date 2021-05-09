package ds.linkedlist;

public class SinglyLinkedList {

    private Node headNode;

    public void add(int number) {

    }

    public void add(int index, int number) {

    }

    public void remove(int index) {

    }

    public int get(int index) {

        return -1;
    }

    public void print() {
        if (empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        Node current = new Node();
        current = headNode;
        while (current != null) {
            System.out.print(current.number + ", ");
            current = current.nextNode;
        }

        System.out.println("\b\b]");
    }

    public void clear() {
        headNode = null;
    }

    public int size() {
        if (empty()) {
            return 0;
        }
        int incrementNode = 0;
        Node current =  new Node();
        current = headNode;
        while (current != null) {
            incrementNode++;
            current = current.nextNode;
        }
        return incrementNode;
    }

    public boolean contains(int number) {
        if (empty()) {
            return false;
        }
        Node current = new Node();
        current = headNode;
        while (current != null) {
            if (current.number == number) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    public boolean empty() {
        return (headNode == null);
    }

}

