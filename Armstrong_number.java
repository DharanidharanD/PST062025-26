import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = m.nextInt();
        int sum = 0;
        int sum1 = 1;
        int digits = 0;
        int temp = 0;
        while (temp!=0) {
            digits++;
            temp /= 10;
        }
        while(num!=0){
            int var = 0;
            var = num%10 ;
            for (int i = 1; i<=digits;i++){
                var *= digits;
                digits = sum;
            }
        }

        num = num/10;
        if (sum1 == sum){
            System.out.println("It is Armstrong");
        }else{
            System.out.println("It is not a Armstrong");
        }
    }
}

