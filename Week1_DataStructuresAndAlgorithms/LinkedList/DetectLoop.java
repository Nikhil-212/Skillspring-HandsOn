public class DetectLoop {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    public static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        System.out.println("Linked List Created: 10 -> 20 -> 30 -> 40");
        System.out.println("Loop connects 40 back to 20");
        System.out.println("Loop Detected: " + hasLoop(first));
    }
}
