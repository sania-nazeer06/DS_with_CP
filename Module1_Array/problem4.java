class Node {
    int data;
    Node next;
    //functionalities
    //Constructor
    Node(int a){
        data=a;
        next=null;
    }
    //method
    public void getData(){
        System.out.println(data);
    }
    public void getRef(){
        System.out.println(next);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Ds with CC");
        Node a= new Node(100);
        Node b= new Node(50);
        Node c= new Node(20);
        System.out.println(a);
        a.getData();
        b.getData();
        c.getData();
        a.getRef();
    }
}
