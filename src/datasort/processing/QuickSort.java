package datasort.processing;

import datasort.mixxig.Random;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class QuickSort {

    private int[] arr = new int[100];

    public QuickSort() {
        Random.mixArray(arr);
        QuickSort(arr, 1, arr.length);


    }

    public void QuickSort(int arr[], int left, int right) {
        int piv = partition(arr, left, right);
        if (left < right) {
            QuickSort(arr, left, piv - 1);
            QuickSort(arr, piv + 1, right);
        }
    }

    public int partition(int arr[], int left, int right) {
        int row = left;
        int high = right;
        int piv = arr[left - 1];
        while (row < high) {
            if (arr[row] < arr[piv]) {
                row++;
            } else if (arr[piv] < arr[high]) {
                high--;
            } else {
                int temp = arr[row];
                arr[row] = arr[high];
                arr[high] = temp;
                piv = row;
            }
        }
        return piv;
    }

    public static void main(String args[]) {
        new QuickSort();
    }

}