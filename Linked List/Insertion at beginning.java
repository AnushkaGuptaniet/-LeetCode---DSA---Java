class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertHead {
    public static Node insertAtHead(Node head, int X){
        Node newNode = new Node(X);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        int X = 7;
        head = insertAtHead(head, X);
        printHead(head);
    }
    public static void printHead(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
// TC: O(1), sC:O(1)
