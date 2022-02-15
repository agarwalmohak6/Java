package Practice;

public class Queue1 {
    Node front, rear;

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isempty() {
        if (front == null)
            return true;
        return false;
    }

    public void enqueue(String data) {
        Node newnode = new Node(data);
        if (isempty()) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
    }

    public void dequeue() {
        if (isempty())
            System.out.println("Underflow");
        else if (front != null) {
            System.out.println(front.data);
            front = front.next;
        }
    }

    public static void main(String[] args) {
        Queue1 obj = new Queue1();
        for (int l = 0; l < args.length; l++) {
            System.out.println("Command line input at index "+l+" : "+args[l]);
            char ans[] = new char[args[l].length()];
            int start = 0, end = args[l].length() - 1;
            for (int i = 0; i < args[l].length(); i++) {
                int num = args[l].charAt(i);
                //System.out.println(args[l].charAt(i));
                //System.out.println(num);
                if (num % 2 == 0)
                    ans[end--] = args[l].charAt(i);
                else
                    ans[start++] = args[l].charAt(i);
            }
            String s = "";
            for (char a : ans) {
                s += "" + a;
            }
            obj.enqueue(s);
            //System.out.println(s);
        }
        while (!obj.isempty()) {
            obj.dequeue();
        }
    }
}