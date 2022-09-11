class quicksort2{
    int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for(int j = low; j<high; j++){
            if(arr[j] <= pivot){
                i++;
                
                // Now I am swapping the array with for index i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Now I am swapping the arr[i+1] and arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    void sort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }   

        public static void main(String args[]){
            int arr[] = {10, 7, 8, 9, 1, 5};
            quicksort2 qs = new quicksort2();
            qs.sort(arr, 0, arr.length-1);
            System.out.println("Sorted Array");
            printArray(arr);
    }
}