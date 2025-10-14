package Test;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 7, 3, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " this is ");
            int min  = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < min ){
                    min = arr[j];
                    minIndex = j;
                }

            }
            //swap
            int tmp = arr[i];
            arr[i] = min;
            arr[minIndex] = tmp;


        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
