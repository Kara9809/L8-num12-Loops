package loopsFibonacci;

public class ex10 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*101)+100;
        for (int i = 1; i <= num ; i++) {
            if (i%7==0)
                System.out.print("Boom! ");
            else if (i/10 ==7 || i % 10 == 7) {
                System.out.print("Boom! ");
            } else {
                System.out.print(i + ",");
            }
            }
        }
        }

