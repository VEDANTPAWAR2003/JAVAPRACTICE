//in method overriding same function snd same paramenters(argumrnts)but different reutrn 

class A
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class B extends A
{
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}

public class Methodoverriding17 
{ 
    public static void main(String[] args) 
    {
        B obj=new B();
        System.out.println(obj.add(5,5));
    }
}
