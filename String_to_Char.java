import java.util.Scanner;

public class String_to_Char {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String one = sc.next();
        after(one);
    }
    static void after(String a){
        char b = a.charAt(0);
        System.out.println(b);
    }
}
