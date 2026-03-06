package Day_6_3_2026;

public class Tricky5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] ref = arr;
        ref[0] = 10;
        arr = new int[]{4, 5, 6};
        System.out.println(ref[0]);
    }
}