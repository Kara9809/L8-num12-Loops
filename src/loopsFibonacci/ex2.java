package loopsFibonacci;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert index");
        int idx = scanner.nextInt();
        while (idx - 2 > 0) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            idx--;
        }
        System.out.println(a2);
        scanner.close();
    }
}
