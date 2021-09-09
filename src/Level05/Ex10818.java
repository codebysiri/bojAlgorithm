package Level05;

import java.util.Scanner;

public class Ex10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];

        num[0] = sc.nextInt();
        int max = num[0];
        int min = num[0];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();

            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }

        }
        System.out.println(min + " " + max);
    }
}
