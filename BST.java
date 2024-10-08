public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left, val);
        }

        else{
            root.right=insert(root.right, val);
        }

        return root;
    }





    public static void main(String[] args) {
        int values[]={5,3,3,4,3,7};
        Node root=null;
    }
}
