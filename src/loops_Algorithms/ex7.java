package loops_Algorithms;

public class ex7 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10_001);
        System.out.println("Number :" + num);
        while (num > 10) {
            num /= 10;
        }
        System.out.println("Left :" + num);
    }
}