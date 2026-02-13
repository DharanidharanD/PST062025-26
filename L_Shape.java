import java.util.Scanner;

public class L_Shape {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of Stars :");
        int one = sc.nextInt();
        a(one);
        b(one);
    }
    static int a(int n) {
        for (int i = 1; i<n; i++) {
            System.out.println("*");
        }
        return 0;
    }
    static int b(int n){
        for (int i = 1;i<=n;i++){
            System.out.print("*   ");
        }
        return 0;
    }
}
