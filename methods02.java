class computer
{
    public void num()
    {
        System.out.println("running in void!");
    }
    public String cost(int price)
    {
        if(price>10)
           return "cost";
        else
           return "Nothing";
    }
}


public class methods02 {
    public static void main(String[] args) {
       
        computer obj= new computer();        //obj is refrence variable
        obj.num();
        
        String str= obj.cost(28);
        System.out.println(str);    }
}
