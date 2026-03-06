package Day_6_3_2026;

public class Tricky1 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x-- - --x;
        System.out.println(y);
    }
}
