package Day_6_3_2026;

public class Tricky4 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5) {
            i++;
            if(i == 3) continue;
            System.out.print(i + " ");
            if(i == 4) break;
        }
    }
}
// 4
//
