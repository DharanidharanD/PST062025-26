import java.util.Scanner;

public class Strong_number {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = n.nextInt();
        int strong = 0;
        int digit = 0;
        int digits = 0;
        while (num != 0) {
            num = num/10;
            digit++;
        }
        while(digits!=0){
            for (int i = 1; i<=digits;i++){
                digits*=i;
            }
        }
    }
}
