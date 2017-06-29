package datasearch;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class BinarySearch {

    private BinarySearch() {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(searchData(arr, 6));
    }

    private int searchData(int arr[], int target) {

        int left = 0;
        int right = arr.length;
        int mid = 0;

        while (left <= right) {
            mid = (right + left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
        }
        return -1;
    }


    public static void main(String args[]) {
        new BinarySearch();
    }
}