package loopsFibonacciSecond_taskForth;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number");
        int sum = 0;
        int count = 0;
        int num  = scanner.nextInt();
        while (num >=0) {
            sum +=num;
            count++;
            System.out.println("Please insert a number");
            num = scanner.nextInt();
        }
        System.out.println("Sum :" + sum);
        if (count !=0) {
            System.out.println("Avg :" + sum / count);
        } else {
            System.out.println("Unable to calculate avg");
        }

        scanner.close();
    }
}
