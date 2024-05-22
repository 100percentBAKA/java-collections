public class LL {
    private class Node {
        Node next;
        int data;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);

        newNode.next =  head;
        head = newNode;

        if(tail == null) tail = head;

        size++;
    }

    public void displaySize() {
        System.out.println("Size of the LL is: " + this.size);
    }

    public void display() {
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }

    public void insertRear(int value) {
        if(tail == null) {
            insertFirst(value);
        }

        Node newNode = new Node(value);

        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void deleteFront() {
        if(head == null) {
            System.out.println("No elements to delete in LL");
            return;
        }
        System.out.println("Deleting the element: " +  head.data);
        head = head.next;
        size--;
    }

    private Node get(int index) {
        if(index > size - 1) {
            System.out.println("Index greater than the size");
            return null;
        }

        Node current = head;
        int temp = index;

        while(index-- != 0) {
            current = current.next;
        }

        return current;
    }

    public void deleteRear() {
        if(size <= 1) {
            deleteFront();
            return;
        }

        Node current = get(size - 2);
        tail = current;
        current.next = null;
        size--;
    }

//    public void insertPos(int index, int value) {
//        if(index > size - 1){
//            System.out.println("Index greater than the size");
//            return;
//        }
//
//        if(index == 0) {
//            insertFirst(value);
//            return;
//        }
//
//        if(index == size - 1){
//            insertRear(value);
//            return;
//        }
//
//        Node current = head;
//        Node newNode = new Node(value);
//
//        while(index-- != 0) {
//            current = current.next;
//        }
//
//        Node nextNode = current.next;
//        current.next = newNode;
//        newNode.next = nextNode;
//        size++;
//    }

    public void insertPos(int index, int value) {
        if(index > size - 1){
            System.out.println("Index greater than the size");
            return;
        }

        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size - 1){
            insertRear(value);
            return;
        }

        Node newNode = new Node(value);

        Node current = get(index);
        Node nextNode = current.next;
        current.next = newNode;
        newNode.next = nextNode;
        size++;
    }

    public void deletePos(int index) {
        if(index == 0) {
            deleteFront();
            return;
        }

        if(index > size - 1){
            System.out.println("Index greater than the size");
            return;
        }

        if(index == size - 1) {
            deleteRear();
            return;
        }

        Node current = get(index - 1); // get previous node
        Node nextNode = get(index + 1); // get the next node

        current.next = nextNode;
        size--;
    }

    public void ReverseLL () {
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    private Node returnMid() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

//    public boolean checkPalindrome() {
//        Node current = head;
//        Node mid = returnMid();
//
//        // if the ll is of odd length
//        if(size % 2 != 0) {
//            mid = mid.next;
//        }
//
//        System.out.println(current.data + " " + mid.data);
//
//        while(mid != null) {
//            if(current.data != mid.data) {
//                return false;
//            }
//            current = current.next;
//            mid = mid.next;
//        }
//
//        return true;
//    }

    public boolean checkPalindrome () {
        Node current = head;
        boolean isPalindrome = true;

        ArrayList<Integer> arr = new ArrayList<>();

        while(current != null) {
            arr.add(current.data);
            current = current.next;
        }

        int length = arr.size();

//        int midIndex = length % 2 == 0 ? (length + 1) / 2 : length / 2;

        for(int i = 0; i < length / 2; i++) {
            if (!arr.get(i).equals(arr.get(length - i - 1))) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public boolean checkPalindrome2() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            // we want the fast pointer to remain at the last position and not move out of the range
            slow = slow.next;
            fast = fast.next.next;
        }

        // logic to reverse the LL from the slow (mid) node
        Node prev = null;

        while(slow != null) {
            Node nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // now the LL from the mid position is reversed and the prev pointer is pointing at the last node
        Node current = head;

        while(prev != null) {
            if(current.data != prev.data) {
                return false;
            }

            prev = prev.next;
            current = current.next;
        }

        return true;
    }

    private ArrayList<Node> findPrevNext(Node random) {
        ArrayList<Node> arr = new ArrayList<>();

        Node current = head;
        Node previous = null;

        if(head == null || random == null) return null;

        while(current != null && current != random) {
            previous = current;
            current = current.next;
        }

        Node nextNode = current.next;

        arr.add( previous);
        arr.add(current);
        arr.add(nextNode);

        return arr;
    }

    
}
