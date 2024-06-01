class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node nn = new Node(val);
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
        } else {
            Node nn = new Node(val);
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node nn = new Node(val);
            Node prev = getnode(index - 1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            deletefirst();
        } else if (index == size - 1) {
            deletelast();
        } else {
            Node prev = getnode(index - 1);
            Node nn = prev.next;
            prev.next = nn.next;
            nn.next = null;
            size--;
        }
    }

    public void deletefirst() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
    }

    public void deletelast() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            deletefirst();
        } else {
            Node prev = getnode(size - 2);
            prev.next = null;
            tail = prev;
            size--;
        }
    }

    private Node getnode(int k) {
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
