public class STACKLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stackk {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        // push function
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
            }

            newNode.next = head;
            head = newNode;

        }

        // pop function
        public static int pop() {

            if (isEmpty()) {
                return -4;
            }
            int top = head.data;
            head = head.next;

            return top;
        }

        // peek function
        public static int peek() {
            if (isEmpty()) {
                return -4;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {
        Stackk s = new Stackk();
        s.push(5);
        s.push(6);
        s.push(7);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
