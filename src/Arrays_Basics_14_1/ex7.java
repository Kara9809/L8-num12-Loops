package Arrays_Basics_14_1;

public class ex7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*90)+10;
            if (arr[i] < min) {
                min = arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Min : " + min);
    }
}