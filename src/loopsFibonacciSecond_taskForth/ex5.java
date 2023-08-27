package loopsFibonacciSecond_taskForth;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number");
        int max = Integer.MIN_VALUE;
        int num = scanner.nextInt();
        while (num != -999) {
            if (num > max) {
                max = num;
            }
            System.out.println("Please insert a number");
            num = scanner.nextInt();
        }
        System.out.println("Max :" + max);
        scanner.close();
    }
}
