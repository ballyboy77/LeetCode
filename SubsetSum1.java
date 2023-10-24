// question : Given an array print all the sum of the subset generated from it, in the increasing order.
// eg := Input: N = 3, arr[] = {5,2,1}
// Output: 0,1,2,3,5,6,7,8

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        int arr[] = { 5, 1, 2 };
        int n = arr.length;
        int sum = 0;
        Subsetsum(0, n, arr, sum, ds);
        Collections.sort(ds);

        System.out.println(ds);

    }

    public static void Subsetsum(int index, int n, int[] arr, int sum, ArrayList<Integer> ds) {

        if (index == n) {
            ds.add(sum);
            return;

        }
        Subsetsum(index + 1, n, arr, sum + arr[index], ds);

        Subsetsum(index + 1, n, arr, sum, ds);

    }

}
