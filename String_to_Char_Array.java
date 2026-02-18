import java.util.Arrays;
import java.util.Scanner;
public class String_to_Char_Array {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String one = sc.next();
        after(one);
    }
    static void after(String a){
        char[] c = a.toCharArray();
        System.out.println("" + Arrays.toString(c));
    }
}
