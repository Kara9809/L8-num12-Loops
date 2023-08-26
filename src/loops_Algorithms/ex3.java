package loops_Algorithms;

public class ex3 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 7) + 1;
        System.out.println("Number :" + num);
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact*= i;
            i++;
        }
        System.out.println("Fact :" + fact);
    }
}