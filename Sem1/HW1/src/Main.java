import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 9};
        int[] arr2 = {4, 2, 6, 3};
        String operation;
        Modules mod = new Modules();
        mod.arrayOper(arr1, arr2, "Sub");
        System.out.println();
        mod.arrayOper(arr1, arr2, "Div");
        System.out.println();
        mod.arrayOper(arr1, arr2, "Add");

        int[][] a1 = {{}, {1}, {2, 3, 32}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12}};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(Arrays.toString(a1[i]));
        }
        mod.checkTriangularArray(a1);
    }
}
