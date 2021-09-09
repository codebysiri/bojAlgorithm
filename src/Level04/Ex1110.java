package Level04;

import java.util.Scanner;

public class Ex1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int COUNT = 0;
        int NUM = N;

        while (true) {
            NUM = (NUM / 10 + NUM % 10) % 10 + NUM %10 * 10;
            COUNT++;
            if (N == NUM) {
                break;
            }
        }
        System.out.println(COUNT);
    }
}
