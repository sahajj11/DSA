import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        
        // HashSet<Integer>set=new HashSet<>();

        // set.add(6);
        // set.add(5);
        // set.add(7);

        // System.out.println(set.contains(8));

        // set.remove(5);

        // System.out.println(set.size());

        // System.out.println(set);

        // //iterartor
        // Iterator it=set.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next() + " ");
        // }

        HashMap<String,Integer>map=new HashMap<>();

        map.put("India", 90);
        map.put("USA",80);

        System.out.println(map);

        if(map.containsKey("India")){
            System.out.println("key is prresent");
        }else{
            System.out.println("key is not present");
        }

        System.out.println(map.get("India"));
        
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            

        }
    }
}

