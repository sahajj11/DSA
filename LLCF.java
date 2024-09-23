//LinkedList Implementation Using Colllection Frameworks

import java.util.*;

public class LLCF {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("linkedList");

        System.out.println(list);
    }
}
