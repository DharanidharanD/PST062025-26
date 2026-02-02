import java.util.Scanner;
public class count_of_digit {
    public static void main(String[] args){
        Scanner one = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = one.nextInt();
        int count = 0;
        while(num!=0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
