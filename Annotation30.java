class A{
     void show(){
        System.out.println("IN A class");
    }
}
class B extends A{
    @Override
    void show(){
        System.out.println("IN B class");
    }
}


public class Annotation30 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
