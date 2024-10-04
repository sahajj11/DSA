import java.util.*;

public class HashMapProblem {
    public static void isMajorityElement(int nums[]){
          HashMap<Integer,Integer>map=new HashMap<>();
          int n=nums.length;

          for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
          }

          for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
          }
    }

    public static void main(String[] args) {
        int nums[]={3,4,5,6,3,4,3,5,3,3,5,5,5};
        isMajorityElement(nums);
    }
}
