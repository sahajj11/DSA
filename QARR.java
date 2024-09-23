//Queue implementation using array

public class QARR {
    static class Queuee {
        static int arr[];
        static int size;
        static int rear = -1;

        Queuee(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //add-function(enqueue)
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        //delete-function(dequeue)
        public static int delete(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;

        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String[] args) {
         Queuee q=new Queuee(5);
         q.add(3);
         q.add(6);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.delete();
         }
    }
}
