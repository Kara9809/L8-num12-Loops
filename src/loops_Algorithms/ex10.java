package loops_Algorithms;

public class ex10 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*100_001);
        int origin = num;
        System.out.println("Number :"+num);
        System.out.println("Right : "+(num%10));
        int count = 0;
        int sum = 0;
        int opposite = 0;
        while (num>10) {
            num/=10;
        }
        System.out.println("Left :"+num);
        while (num>0) {
            count++;
            sum+=num%10;
            opposite=opposite*10+num%10;
            num/=10;
        }
        System.out.println("count :"+count);
        System.out.println("sum :"+sum);
        System.out.println("opposite: "+opposite);
        if (origin==opposite) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
