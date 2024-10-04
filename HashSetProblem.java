import java.util.*;

public class HashSetProblem {
    public static int union(int arr1[],int arr2[]){
      HashSet<Integer>set=new HashSet<>();

      for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
      }

      for(int j=0;j<arr2.length;j++){
        set.add(arr2[j]);
      }

      return set.size();

    }

    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet<>();
        int count=0;
  
        for(int i=0;i<arr1.length;i++){
          set.add(arr1[i]);
        }
  
       for(int j=0;j<arr2.length;j++){
           if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
           }
       }

       return count;
  
      }



    public static void main(String[] args) {
        int arr1[]={4,5,6,7};
        int arr2[]={5,9,3,6};

        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));

        
    }
}
