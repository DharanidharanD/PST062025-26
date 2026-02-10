import java.util.Scanner;

public class Ascii_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String my = sc.next();
        one(my);
    }
    static void one(String my){
        for (int i = 0;i<=my.length()-1;i++) {
            char it = my.charAt(i);
            System.out.println((int) it);
        }
    }
}
