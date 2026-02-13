public class Merge {
    public static void main(String[] args){
        A H = new A();
        H.one();
    }
}
class A {
    void one() {
        System.out.println("HI, How are you");
        B X = new B();
        X.two();
    }
}
class B extends A{
   void two(){
        System.out.println("I am fine thank you");
   }
}
