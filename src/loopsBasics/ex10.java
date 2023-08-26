package loopsBasics;

public class ex10 {
    public static void main(String[] args) {
        int max = (int) (Math.random()*51)+50;
        int den = (int) (Math.random()*5)+1;
        if (den > max) {
            int tmp = max;
            max = den;
            den = tmp;
        }
        for (int i = 1; i <= max ; i++) {
            if (i % den == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
