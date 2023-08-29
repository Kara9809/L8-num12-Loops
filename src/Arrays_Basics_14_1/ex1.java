package Arrays_Basics_14_1;

public class ex1 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c'};
        int countA = 0;
        int countC = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                countA++;
            } else if (arr[i] == 'c') {
                countC++;
            }
        }
        System.out.println("a appears " + countA + " times");
        System.out.println("a or c appears " + (countA + countC) + " times");

    }

}

