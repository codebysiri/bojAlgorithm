package Level03;

import java.util.Scanner;

public class Ex10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int a[] = new int[N];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] < X) {
                System.out.println(a[i]);
            }
        }
    }
}
