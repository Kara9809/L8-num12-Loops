package loopsFibonacci;

public class ex9 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 96) + 5;
        int b = (int) (Math.random() * 96) + 5;
        int max = 0;
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        System.out.println("start :" + start);
        System.out.println("end :" + end);
        int a1 = 1;
        int a2 = 1;
        while (a2 < start) {
            a2 = a2 + a1;
            a1 = a2 - a1;
        }
        System.out.println(a2);
        if (a2 % 2 == 0) {
            max = a2;
        }
        while (a2 < end) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            if (a2 % 2 == 0) {
                if (max > a2) {
                    max = a2;
                }
                System.out.println("," + a2);
            }
        }
        System.out.println();
        if (max != 0) {
            System.out.println("," + max);
        }

    }
}

