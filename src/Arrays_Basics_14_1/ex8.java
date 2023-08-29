package Arrays_Basics_14_1;

public class ex8 {
    public static void main(String[] args) {
        int[] arr = new int [10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*90)+10;
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum : "+ sum);
    }
}
