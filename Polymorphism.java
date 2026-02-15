public class Polymorphism {
    public static void main(String[] args){
        System.out.println(one());
        System.out.println(sub(200,15));
        System.out.println(multiply(20,15));
        int d = 12;
        int e = 13;
        int f = 14;
        System.out.println(we(d,e));
        System.out.println(we(d,e,f));

    }
    static int one() {
        int a = 24;
        System.out.println(two());
        return a;
    }
    static int two(){
        int m = 20;
        int n = 30;
        System.out.println(war());
        return m+n;
    }
    static String war(){
        String w = "Hi, The numbers are ";
        return w;
    }
    static int sub(int r, int s){
        return r-s;
    }
    static int multiply(int r, int s){
        return r*s;
    }
    static boolean tr(){
        return true;
    }
    static int we(int d, int e){
        return d/e;
    }
    static int we(int d, int e, int f){
        return d*e+f;
    }
}
