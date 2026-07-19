public class DeleteNode {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    public static Node deleteByValue(Node head, int value) {
        if (head == null) return null;
        if (head.data == value) return head.next;
        Node current = head;
        while (current.next != null && current.next.data != value) current = current.next;
        if (current.next != null) current.next = current.next.next;
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
        head.next.next.next = new Node(40);
        System.out.print("Linked List Before Deletion: ");
        display(head);
        head = deleteByValue(head, 30);
        System.out.print("\nLinked List After Deleting 30: ");
        display(head);
    }
}
