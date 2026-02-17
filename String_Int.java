import java.util.Scanner;
public class String_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String n = sc.next();
        change(n);
    }
    public static void change(String u) {
        int num = 0;
        int one = u.length();
        for (int i = 0; i < one; i++) {
            num = ((int) u.charAt(i));
            System.out.println(num);
        }
    }
}
