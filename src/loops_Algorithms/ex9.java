package loops_Algorithms;

public class ex9 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*100_001);
        int origin=num;
        System.out.println("Number :"+num);
        int opposite=0;
        while (num>1) {
            opposite = opposite * 10 + num % 10;
            num /= 10;
        }
        System.out.println("opposite :"+opposite);
        if (origin==opposite) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");

        }
    }
}
