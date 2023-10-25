// Given an integer array nums 
// that may contain duplicates, 
// return all possible  subsets
//  (the power set).

// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        PowerSet(0, nums, new ArrayList<>(), ans);
        System.out.println(ans);

    }

    public static void PowerSet(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            ds.add(nums[i]);
            PowerSet(i + 1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }

    }
}
