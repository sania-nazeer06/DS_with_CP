class TreeNode{
    int d;
    TreeNode l,r;
    TreeNode(int d){
        this.d=d;
        this.l=null;
        this.r=null;
    }
    void preorder(TreeNode n){
        if(n==null) return; //base condition
        System.out.println(n.d);
        preorder(n.l);
        preorder(n.r);
    }
    void postorder(TreeNode n){
        if(n==null) return; //base condition
        System.out.println(n.d);
        postorder(n.l);
        postorder(n.r);
    }
    void inorder(TreeNode n){
        if(n==null) return; //base condition
        System.out.println(n.d);
        inorder(n.l);
        inorder(n.r);
    }
}
class Main {
public static void main(String[] args) {
    TreeNode a=new TreeNode(5); //root node
    TreeNode b=new TreeNode(10);
    TreeNode c=new TreeNode(15);
    TreeNode d=new TreeNode(20);
    TreeNode e=new TreeNode(25);
    TreeNode f=new TreeNode(30);
    System.out.println(a.d);
    System.out.println(b.d);
    //linking the nodes
    a.l=b;
    a.r=c;
    b.l=d;
    b.r=e;
    c.l=f;
    System.out.println("inorder");
    a.inorder(a);
    System.out.println("postorder");
    a.postorder(a);
    System.out.println("preorder");
    a.preorder(a);
}
}
