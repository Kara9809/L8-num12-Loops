package loopsFibonacci;

public class ex6 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        int num = (int) (Math.random() * 31) + 10;
        int sum = 0;
        System.out.println("number :" + num);
        System.out.println(a1 + " " + a2);
        while (a2 < num) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            if (a2 < num) {
                System.out.println("," + a2);
                sum += a2;
            }
        }
        System.out.println();
        System.out.println("sum : " + sum);
    }
}
