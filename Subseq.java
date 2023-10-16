import java.util.ArrayList;
import java.util.List;

public class Subseq {
    static List<List<Integer>> result;

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        result = new ArrayList<>();
        subseq(arr, new ArrayList<Integer>(), 0);
        System.out.println(result);

    }

    public static void subseq(int[] arr, ArrayList<Integer> temp, int index) {
        if (index >= arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[index]);
        subseq(arr, temp, index + 1);
        temp.remove(temp.size() - 1);

        subseq(arr, temp, index + 1);

    }
}
