import java.util.Scanner;

public class Str_Int {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String num = sc.next();
        one(num);
    }
    static void one(String nu) {
        int n = Integer.parseInt(nu);
        System.out.println( n);
    }
}
