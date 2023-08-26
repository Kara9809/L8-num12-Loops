package loopsBasics;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i+=2) {
            System.out.println(i + " ");
        }
        System.out.println();
        scanner.close();
        }
    }