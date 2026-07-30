import java.util.Scanner;
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
public class DeleteNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        Node head = createList(n, sc);
        System.out.print("Enter node u want to delete: ");
        Node node = new Node(sc.nextInt());
        deleteNode(node);
        System.out.print("Linked List: ");
        printList(head);

    }
    public static Node createList(int n, Scanner sc){
        if(n == 0)
            return null;
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for(int i = 1; i < n; i++){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        return head;
    }
    public static void deleteNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
