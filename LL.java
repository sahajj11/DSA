class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode=new Node(data);
        if (head == null) {
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }


    //add last

    public void addLast(String data){
        Node newNode=new Node(data);
        if (head == null) {
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
 
    }

    //print list

    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }

        System.out.println("null");
    }

    //remove first

    public void removeFirst(){
        Node currNode=head;
        head=currNode.next;
    }

    //remove last

    public void removeLast(){
        Node currNode=head;
        while(currNode.next.next!=null){
            currNode=currNode.next;
        }
        currNode.next=null;
    }

    //reverse linkedList

    public void reverseIterative(){

        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;

        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }

        head.next=null;
        head=prevNode;

    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("linkedList");
        list.printList();
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList();

        list.reverseIterative();
        list.printList();

    }
}