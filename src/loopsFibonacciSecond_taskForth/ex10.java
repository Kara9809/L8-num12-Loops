package loopsFibonacciSecond_taskForth;

public class ex10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i+=2) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact*=j;
            }
            System.out.println("val : "+i + " , fact : "+fact);
        }
    }
}
