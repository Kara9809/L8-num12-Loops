package loopsFibonacci;

public class ex1 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        System.out.println(a1 + "," + a2);
        for (int i = 0; i < 28; i++) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            System.out.print("," + a2);
        }
        System.out.println();
    }
}
