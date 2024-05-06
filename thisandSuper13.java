//this(); represents the construstor of the its own class
//super();represents goes to the super class of the class it extendds
//every class default has super function 
class A
{
    public A()                      //Default constructor
    {
        super();
        System.out.println("In A!");
    }
    public A(int n)                 //paramatrised constructor
    {
        super();
        System.out.println("In int B!");
    }
}
class B extends A                          //Single inheritance
{
    public B()
    {
        super();
        System.out.println("In B!");
    }
    public B(int n)
    {
        super();
        System.out.println("In int B!");
    }
}

public class thisandSuper13 {
    public static void main(String ars[])
    {
        B obj = new B();
    }
}
