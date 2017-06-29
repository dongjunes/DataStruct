package datasort.processing;

import datasort.mixxig.Random;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class MergeSort {

    private int arr[] = new int[10];
    private int sort[] = new int[arr.length];

    public MergeSort() {
        Random.mixArray(arr);
        int left = 0;
        int right = arr.length - 1;
        mergeSort(left, right, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public void mergeSort(int left, int right, int arr[]) {
        int mid = 0;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(left, mid, arr);
            mergeSort(mid + 1, right, arr);

            merge(left, mid, right, arr);
        }
    }

    public void merge(int left, int mid, int right, int arr[]) {

        int lIndex = left;
        int rIndex = mid + 1;
        int index = left;

        while (lIndex <= mid && rIndex <= right) {
            if (arr[lIndex] < arr[rIndex]) {
                sort[index] = arr[lIndex++];
            } else {
                sort[index] = arr[rIndex++];
            }
            index++;
        }

        if (left > mid) {
            for (int i = rIndex; i <= right; i++, index++) {
                sort[index] = arr[i];
            }
        } else {
            for (int i = lIndex; i <= mid; i++, index++) {
                sort[index] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sort[i];
        }
        for (int i = left; i < right; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        new MergeSort();
    }

}