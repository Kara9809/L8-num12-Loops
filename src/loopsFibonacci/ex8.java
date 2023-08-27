package loopsFibonacci;

public class ex8 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 96) + 5;
        int b = (int) (Math.random() * 96) + 5;
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        System.out.println("Start :" + start);
        System.out.println("End :" + end);
        int a1 = 1;
        int a2 = 1;
        while (a2 < start) {
            a2 = a2 + a1;
            a1 = a2 - a1;
        }
        System.out.println(a2);
        while (a2 < end) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            if (a2 <= end) {
                System.out.println("," + a2);
            }
        }
    }
}