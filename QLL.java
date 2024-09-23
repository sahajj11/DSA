public class QLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // enqueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int front = head.data;

            if (head == tail) {
                tail = null;
            }
            head = head.next;

            return front;

        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {
               Queue q=new Queue();

               q.add(4);
               q.add(5);
               q.add(6);

               q.remove();

               while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
             }
    }
}
