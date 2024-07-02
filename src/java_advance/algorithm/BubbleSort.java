package java_advance.algorithm;

public class BubbleSort {
    public static void main(String[] args) {

        int[]arr = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        System.out.println("Sorted array by increasing order = ");
        for (int arrayNumber: arr){
            System.out.print(arrayNumber + " ");
        }
    }

    public static void  bubbleSort(int[]arr){

        int n = arr.length;
        for (int turn = 0;  turn < n-1; turn++) { // 0 0<5-1=4
            for (int j = 0; j < n-1-turn; j++) {// 0 < 5-1-0=4  or j<=n-2-turn
                if (arr[j] >arr [j+1]){ //index 0 5>4 index 1
                    //swap
                    int swapValue = arr[j]; // 5
                    arr[j] = arr[j+1]; // index 0 = 4
                    arr[j+1] = swapValue; // index 1 = 5// 4 1 3 2 5
                }
            }
        }
    }

}
