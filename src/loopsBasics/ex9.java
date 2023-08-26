package loopsBasics;

public class ex9 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*51)+50;
        System.out.println(a + "a");
        int b = (int) (Math.random()*51)+50;
        System.out.println(b + "b");
        for (int i = Math.min(a,b); i <= Math.max(a,b) ; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
