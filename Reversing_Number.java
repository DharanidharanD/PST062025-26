import java.util.Scanner;
public class Reversing_Number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        while(num!=0){
            int tem = num%10;
                    System.out.println(tem);
                    num = num/10;
        }
    }
}
