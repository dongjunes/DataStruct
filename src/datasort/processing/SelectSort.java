package datasort.processing;

import datasort.mixxig.Random;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class SelectSort {

    public SelectSort() {
        int arr[] = new int[100];
        arr = Random.mixArray(arr);
        printData(sorting(arr));
    }

    public int[] sorting(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public void printData(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        new SelectSort();
    }
}