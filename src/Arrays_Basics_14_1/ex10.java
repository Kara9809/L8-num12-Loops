package Arrays_Basics_14_1;

public class ex10 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int max = 0;
        int min = 100;
        int maxIdx = 0;
        int minIdx = 0;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < args.length; i++) {
            arr [i] = (int) (Math.random() * 100) + 1;
            int num = arr[i];
            System.out.println(num + " ");
            if (num > max) {
                max = num;
                maxIdx = i;
            }
            if (num < min) {
                min = num;
                minIdx = i;
            }
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        System.out.println();
        System.out.println("Max :" + max);
        System.out.println("max location : " + maxIdx);
        System.out.println("Min :" + min);
        System.out.println("min location : " + minIdx);
        System.out.println("Sum is :" + (sumEven + sumOdd));
        System.out.println("avg :" + (sumEven + sumOdd) * 1.0 / arr.length);
        System.out.println("sum Even :" + sumEven);
        System.out.println("sum Odd :" + sumOdd);
    }
}
