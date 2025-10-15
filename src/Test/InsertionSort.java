package Test;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {8, 4, 2, 5, 1, 9};

        for(int i=1; i<arr.length; i++){ // index 0 은 비교할 필요가 없다.
            int key = arr[i];

            int j = i-1;

            while(j >=0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;

        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
