package Practice;

public class Queue2 {
    Node front;
    Node rear;

    public Queue2() {
        front = null;
        rear = null;
    }

    public static void main(String[] args) {
        // Creation of the node class object
        Queue2 obj= new Queue2();
        for(int i=0;i<args.length;i++){
            int s=0;
            int p=1;
            for(int j=1;j<=args[i].length();j++){
                int n=Character.getNumericValue(args[i].charAt(j-1));
                s+=p*n;
                p++;
            }
            obj.enqueue(s);
        }
        obj.display();
    }

    public void enqueue(int data) {
        Node newnode=new Node(data);
        if (front == null || newnode.data < front.data) {
            newnode.next = front;
            front = newnode;
        } else {
            Node temp = front;

            while (temp.next != null && temp.next.data <= newnode.data) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;

        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
