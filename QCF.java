//Queue implementation using CollectionFramewoks

import java.util.*;

public class QCF {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
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
