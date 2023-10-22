import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = { 2, 3, 6, 7 };
        int target = 8;
        List<Integer> ds = new ArrayList<>();
        Combination(0, arr, target, ans, ds);
        System.out.println(ans);

    }

    public static void Combination(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);
            Combination(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        Combination(index + 1, arr, target, ans, ds);
    }

}
