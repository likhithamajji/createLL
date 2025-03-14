class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class createsinglylinkedlist{
    public static void main(String[] args) {
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        LL.add(6);
        LL.display();
    }
}
class LL{
    public static  Node head;
    public static void add (int num){
        Node newnode=new Node(num);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void display(){
        Node temp=head;
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}