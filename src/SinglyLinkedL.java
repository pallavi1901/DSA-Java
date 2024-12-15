public class SinglyLinkedL {

    private Node head;

    private class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val)
    {
            Node newNode = new Node(val);

            if(head == null)
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public static void main(String[] args)
    {
        SinglyLinkedL list = new SinglyLinkedL();
        list.insertFirst(78);
        list.insertFirst(88);
        list.insertFirst(90);
        list.insertFirst(100);

        list.display();

    }




}
