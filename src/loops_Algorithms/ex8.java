package loops_Algorithms;

public class ex8 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*10_001);
        System.out.println("Number :"+num);
        int opposite = 0;
        while (num>=1) {
            opposite=opposite*10+num%10;
            num/=10;
        }
        System.out.println("opposite :"+ opposite);
    }
}
