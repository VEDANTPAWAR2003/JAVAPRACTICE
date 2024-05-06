//method overloading : same function name  with differrent parameters 

class computer
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;

    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}





public class metoveerloading03 {
    public static void main(String arg[])
    {
        computer obj = new computer();
        int n=obj.add(20, 30);
         int m= obj.add(20, 30, 50);
        System.out.println(n);
        System.out.println(m);


    }
}
