import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amt:");
        int P = sc.nextInt();
        System.out.println("Enter the rate of int:");
        int R = sc.nextInt();
        System.out.println("Enter the time period:");
        int T = sc.nextInt();
        int SI=(P*R*T)/100;
        System.out.println("Simple Interest is  "+SI);
    }
}