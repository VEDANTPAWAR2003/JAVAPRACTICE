//class inside a class
//ex= A$B B is the class inside of class A and can't be accessed directly , use A.B to access it.

class A{

    int num=10;
    public void show(){
        System.out.println("in show");

    }
    
    class B{
        public void Conf(){
            System.out.println("In config");
        }
    }
}

public class InnerClass26 {
    
    public static void main(String[] args) {
        
        A obj =new A();
        obj.show();

        A.B obj1= obj.new B();
        obj1.Conf();
    }
}
