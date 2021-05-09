package ds.linkedlist;

public class SinglyLinkedList {

    private Node headNode;

    public void add(int number) {
        if (size() == 0) {
            headNode = new Node();
            headNode.number = number;
            headNode.nextNode = null;
        } else {
            Node current =  new Node();
            current = headNode;
            if (current.nextNode == null) {
                Node temp = new Node();
                temp.number = number;
                temp.nextNode = null;
                current.nextNode = temp;
            }
        }

    }

    public void add(int index, int number) {

    }

    public void remove(int index) {
        if (index == 0) {
            headNode = null;
            return;
        }
        int incrementNode = 0;
        Node current =  new Node();
        current = headNode;
        while (current != null) {
            if (incrementNode == index) {
                Node temp = new Node();
                temp = headNode;
                for (int i = 0; i < incrementNode - 1; i++) {
                    temp = temp.nextNode;
                }
                temp.nextNode = current.nextNode;
                headNode = temp;
                break;
            } else {
                current = current.nextNode;
                incrementNode++;
            }
        }
    }

    public int get(int index) {
        if (empty()) {
            throw new RuntimeException("Singly Linked List is empty");
        }
        if (size() <= index) {
            throw new RuntimeException("Index is out of current Singly Linked List");
        }
        Node current =  new Node();
        int incrementNode = 0;
        current = headNode;
        while (current != null) {
            if (incrementNode == index) {
                return current.number;
            }
            incrementNode++;
            current = current.nextNode;
        }
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

