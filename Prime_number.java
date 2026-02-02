import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 2;i<=n;i++) {
            if (n % i == 0) {
                System.out.print("It is not prime");
                break;
            } else {
                System.out.println("It is a prime");
                break;
            }
        }
    }
}
