public class LinearSearch {

    public static int linearSearch(int arr[],int target){

        if (arr == null || arr.length == 0) {
            return -1; 
        }


         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            
         }
         return -3;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        int target=5;

        System.out.println(linearSearch(arr, target));
    }
}
