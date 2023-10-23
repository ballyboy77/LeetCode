
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int[] arr = { 1, 1, 1, 2, 2 };
        Arrays.sort(arr);
        int target = 4;
        CombinationSum(0, arr, target, result, new ArrayList<>());
        System.out.println(result);

    }

    public static void CombinationSum(int index, int[] arr, int target, List<List<Integer>> result, List<Integer> ds) {
        if (target == 0) {
            result.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }

            ds.add(arr[i]);
            CombinationSum(i + 1, arr, target - arr[i], result, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
