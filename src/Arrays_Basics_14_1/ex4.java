package Arrays_Basics_14_1;

public class ex4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 3, 2, 1, 9, 5, 1, 1, 9};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            } else if (arr[i] == 3) {
                count3++;
            } else if (arr[i] == 5) {
                count5++;
            }
        }
        System.out.println("the digit 3 appears " + count3 + " times");
        System.out.println("the digit 1 appears " + count1 + " times");
        System.out.println("the digits 2 or 5 appears " + (count2+count5) + " times");
    }

}

