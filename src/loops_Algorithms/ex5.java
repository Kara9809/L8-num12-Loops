package loops_Algorithms;

public class ex5 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*10_001);
        System.out.println("Num : "+num);
        int count = 1;
        while (num>10) {
            num/=10;
            count++;
        }
        System.out.println("count : "+count);
    }
}
