package Level03;

import java.util.Scanner;

public class Ex2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int N = sc.nextInt();
        for (i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
