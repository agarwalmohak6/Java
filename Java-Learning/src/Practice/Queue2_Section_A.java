package Practice;

public class Queue2_Section_A {
    Node front,rear;
    static class Node{
        String data;
        Node next;
        public Node(String data){
            next=null;
            this.data=data;
        }
    }
    public boolean isEmpty(){
        if(front==null)
            return true;
        return false;
    }
    public void enqueue(String data){
        Node newnode=new Node(data);
        if(isEmpty()){
            front=rear=newnode;
        }
        else
            rear.next=newnode;
            rear=newnode;
    }
    public void dequeue(){
        if(isEmpty())
            System.out.println("Underflow");
        else if(front!=null)
        {
            System.out.println(front.data);
            front=front.next;
        }
    }

    public static void main(String[] args) {
        Queue2_Section_A obj=new Queue2_Section_A();
        for(int l=0;l< args.length;l++){
            boolean flag=false;
            for(int i=0;i<args[l].length()-1;i++){
                int a=Character.getNumericValue(args[l].charAt(i));
                int b=Character.getNumericValue(args[l].charAt(i+1));
                //System.out.println(a+" "+b);
                int diff=Math.abs(a-b);
                if(diff!=1){
                    flag=true;
                }
            }
            if(flag==true)
                obj.enqueue("False");
            else
                obj.enqueue("True");
        }
        while(!obj.isEmpty()){
            obj.dequeue();
        }
    }
}
