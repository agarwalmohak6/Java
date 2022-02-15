package Practice;

public class Queue1_Section_A {
    Queue1.Node front, rear;

    static class Node {
        String data;
        Queue1.Node next;

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
        Queue1.Node newnode = new Queue1.Node(data);
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
        Queue1_Section_A obj = new Queue1_Section_A();
        for (int l = 0; l < args.length; l++) {
            System.out.println("Command line input at index "+l+" : "+args[l]);
            char ans[] = new char[args[l].length()];
            int mid=-1;
            if(ans.length%2==0)
                mid=ans.length/2;
            else
                mid=ans.length/2+1;
            ans[0]=args[l].charAt(mid);
            int c=1;
            for(int i=args[l].length()-1;i>mid;i--)
                ans[c++]=args[l].charAt(i);
            for(int i=0;i<mid;i++)
                ans[c++]=args[l].charAt(i);
            String s = "";
            for (char a : ans) {
                s += "" + a;
            }
            obj.enqueue(s);
        }
        while (!obj.isempty()) {
            obj.dequeue();
        }
    }
}