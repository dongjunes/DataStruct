package datasort.processing;

import datasort.mixxig.Random;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class BubbleSort {

    public BubbleSort() {
        int arr[] = new int[100];
        arr = Random.mixArray(arr);
        printData(sorting(arr));
    }

    public int[] sorting(int arr[]) {
        int i, j, temp;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
        new BubbleSort();
    }
}