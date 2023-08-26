package loops_Algorithms;

public class ex4 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*7)+1;
        System.out.println("Number :" +num);
        int fact = 1;
        int i = num;
        while (i>=1) {
            fact*=i;
            i--;
        }
        System.out.println("Fact :"+fact);
    }
}
