package DataStructures;

public class LinkedList {

    private Node head;

    static class Node {

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    static LinkedList insert(LinkedList list, int data) {
        if (list.head == null) {
            list.head = new Node(data);
        } else {
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
        return list;
    }

    private static void deleteWithData(LinkedList list, int data){
        if (list.head == null) {
            System.out.println("Data does not exist");
        } else if (list.head.data == data) {
            list.head = list.head.next;
        }else{
            Node current = list.head;
                while (current.next != null) {
                    if (current.next.data == data) {
                        current.next = current.next.next;
                        break;
                    }
                }
            }
        }

    private static void printList(LinkedList list)
    {
        Node current = list.head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        deleteWithData(list, 2);
        printList(list);
    }
}
