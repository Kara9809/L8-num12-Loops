package loops_Algorithms;

public class ex2 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*7)+1;
        System.out.println("Number is : "+num);
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Fact : "+fact);
    }
}
