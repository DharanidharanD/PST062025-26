import java.util.Scanner;
public class Sum_of_digits {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = n.nextInt();
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum += digit;
            num =  num/10;
            System.out.println(sum);
        }
    }
}
