import java.util.ArrayList;

/**
 * Subestsum
 */
public class Subsetsum {

    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        int[] arr = { 1, 2, 1 };
        int n = 3;
        int sum = 2;
        subsum(n, ds, 0, arr, sum, 0);

    }

    public static void subsum(int n, ArrayList<Integer> ds, int s, int[] arr, int sum, int index) {
        if (index == n) {
            if (s == sum) {
                System.out.print("{");
                for (int i = 0; i < ds.size(); i++) {
                    System.out.print(ds.get(i));
                    if (i < ds.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("}");
            }
            return;

        }
        ds.add(arr[index]);
        s += arr[index];
        subsum(n, ds, s, arr, sum, index + 1);

        ds.remove(ds.size() - 1);
        s -= arr[index];
        subsum(n, ds, s, arr, sum, index + 1);

    }
}