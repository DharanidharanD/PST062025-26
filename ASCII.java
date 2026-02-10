import java.util.Scanner;

public class ASCII {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the ascii value:");
        int asc=sc.nextInt();
        int i=asc;
        System.out.print((char)i);
    }
}
