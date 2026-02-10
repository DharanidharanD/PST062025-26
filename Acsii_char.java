import java.util.Scanner;
public class Acsii_char {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the acsii char : ");
        char we = sc.next().charAt(0);
        y(we);
    }
    public char y(char we){
        System.out.println((int)we);
        return 0;
    }
}
