package datastruct;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class Heap {
    int useNum = 0;
    int arr[];

    public Heap(int length) {
        arr = new int[length];
    }

    public void insert(int data) {
        int i = ++useNum;

        while (i != 1 && data < arr[i / 2]) {
            arr[i] = arr[i / 2];
            i /= 2;
        }
        arr[i] = data;
    }

    public int delete() {
        int parent, child;
        int data, temp;
        data = arr[1];
        temp = arr[useNum--];
        parent = 1;
        child = 2;
        while (child <= useNum) {
            if (child < useNum && arr[child] > arr[child + 1]) {
                child++;
            }
            if (temp <= arr[child]) {
                break;
            }

            arr[parent] = arr[child];
            parent = child;
            child *= 2;
        }
        arr[parent] = temp;
        return data;
    }

    public void printData() {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}