package loopsFibonacciSecond_taskForth;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease insert a rows");
        int rows = scanner.nextInt();
        System.out.println("Please insert a cols");
        int cols = scanner.nextInt();
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= cols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        scanner.close();
    }
}
