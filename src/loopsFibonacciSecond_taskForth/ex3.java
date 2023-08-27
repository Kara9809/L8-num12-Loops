package loopsFibonacciSecond_taskForth;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease insert a number");
        int num = scanner.nextInt();
        while (num > 0) {
            int fact = 1;
            for (int i = 1; i <= num ; i++) {
                fact *= i;
            }
            System.out.println("Num : " + num + " , fact :" + fact);
            System.out.println("Please insert a number");
            num = scanner.nextInt();

        }
        scanner.close();
    }
}
