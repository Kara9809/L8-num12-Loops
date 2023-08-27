package loopsFibonacciSecond_taskForth;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number");
        int sum = 0;
        int num = scanner.nextInt();
        while (num >= 0) {
            sum +=num;
            System.out.println("Please insert a number");
            num = scanner.nextInt();
        }
        System.out.println("Sum :" + sum);
        scanner.close();
    }
}
