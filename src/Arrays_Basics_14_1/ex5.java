package Arrays_Basics_14_1;

public class ex5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            System.out.print(arr[i] + " ");
        }
            System.out.println();

        }
    }

