public class BinarySearch {
    public static int binarySearch(int arr[],int target){
           int low=0;
           int high=arr.length-1;

           while(low<=high){
            int mid=(low+high)/2;

           if(arr[mid]==target){
            return mid;
           }

           else if (arr[mid]>target) {
               high=mid-1;
           }

           else{
            low=mid+1;
           }

           
           }

           return -3;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        int target=8;

        System.out.println(binarySearch(arr, target));
    }
}
