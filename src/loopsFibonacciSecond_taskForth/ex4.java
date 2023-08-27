package loopsFibonacciSecond_taskForth;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number");
        int num = scanner.nextInt();
        while (num >= 1) {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime) {
                    System.out.println(num + " is Prime Number");
                } else {
                    System.out.println(num + " is NOT a prime number");
                }
            System.out.println("Please insert a number");
                    num = scanner.nextInt();
                }
                scanner.close();
            }
        }
