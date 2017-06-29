package datasort.mixxig;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class Random {

    public final static int[] mixArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * arr.length)+1);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }

}