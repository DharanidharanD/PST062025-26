import java.util.Scanner;
public class Char_to_String {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charcter :");
        char a = sc.next().charAt(0);
        con(a);
    }
    static void con(char w){
        String s = Character.toString(w);
        System.out.println(s);
    }
}