import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no.of Stars: ");
        int one = in.nextInt();
        Ver(one);
        Hor(one);
    }

public static void Hor(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void Ver(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("    *   ");
        }
    }
}


