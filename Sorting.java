public class Sorting {

    //bubble sort function
    static void bubbleSort(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
 
        }
       }
    }

    //selection sort
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
        }
    }

    //insertion sort
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;

            }

            arr[j+1]=current;
        }
    }

    //function to print array
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[]={3,7,4,8};

        insertionSort(arr);
        printArray(arr);
    }
}
