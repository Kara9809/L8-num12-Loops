package Arrays_Basics_14_1;

public class ex3 {
    public static void main(String[] args) {
        String name = "Sara Shara Shir Cameah";
        char[] letters = name.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                count++;
            }
        }
        System.out.println("in " + name + " " + "there are " + count + " letters");
    }
}
