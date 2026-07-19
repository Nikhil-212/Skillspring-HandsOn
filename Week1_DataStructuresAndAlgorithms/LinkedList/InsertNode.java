public class InsertNode {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
        return head;
    }
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.print("Linked List Before Insertion: ");
        display(head);
        head = insertAtEnd(head, 40);
        System.out.print("\nLinked List After Insertion: ");
        display(head);
    }
}
