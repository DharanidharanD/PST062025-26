import java.util.Scanner;

public class Sum_ASCII {
    public static void main(String[] args){
        Scanner ne = new Scanner(System.in);
        System.out.println("Enter a word :");
        String as = ne.next();
        two(as);
    }
    public static void two(String as){
        int b = 0;
        for (int i = 0; i<=as.length()-1;i++){
            b += as.charAt(i);
            System.out.println(b);
        }
    }
}
