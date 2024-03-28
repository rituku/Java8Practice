package practice;

public class QuickSort {
    public static int quickSort(int array[], int l, int h){

        int start = l;
        int end = h;
        int pivot = array[l];

        while(start < end){
            while(start<= h && array[start] <= pivot){
                start++;
            }
            while(array[end] > pivot){
                end--;
            }
            if(start < end){
                swap(array, start, end);
            }
        }
        swap(array, l, end);
        return end;
    }

    public static void swap(int arr[], int l1, int l2){
        int temp = arr[l1];
        arr[l1] = arr[l2];
        arr[l2] = temp;
    }

    public static void arraysSort(int arr[], int l, int h){
        if(l < h) {
            int loc = quickSort(arr, l, h);
            arraysSort(arr, l, loc - 1);
            arraysSort(arr, loc + 1, h);
        }
    }
    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 0, 1, 1, 0};
        arraysSort(arr, 0, arr.length-1);
        // System.out.println(array);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
