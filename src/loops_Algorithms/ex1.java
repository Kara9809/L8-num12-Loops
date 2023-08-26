package loops_Algorithms;

public class ex1 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*7)+1;
        System.out.println("Number : " + num);
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact = fact * i;
        }
        System.out.println("fact : " + fact);
        }
    }

