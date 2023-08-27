package loopsFibonacciSecond_taskForth;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number");
        int min = Integer.MAX_VALUE;
        int num = scanner.nextInt();
        while (num != -999) {
            if (num < min) {
                min = num;
            }
            System.out.println("Please insert a number");
            num = scanner.nextInt();
        }
        System.out.println("Min :" + min);
        scanner.close();
    }
}
