import java.util.Scanner;
public class Swapping_2 {
    public static void main(String[]args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1st value : ");
        int a = ob.nextInt();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2nd value : ");
        int b = obj.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The swapped values are "+a+ " and "+b);
    }
}
