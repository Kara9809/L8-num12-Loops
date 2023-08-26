package loopsFibonacci;

public class ex4 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        int num = (int) (Math.random()*31)+10;
        System.out.println("num :"+num);
        System.out.println(a1 + "," + a2);
        while (a2 < num) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            if (a2 < num && a2 % 2 == 0) {
                System.out.println(a2 + " ");
            }
        }
        System.out.println();
    }
}
