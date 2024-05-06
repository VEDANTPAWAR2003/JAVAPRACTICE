//this keyword use
class Demo
{
    private int age;
    private String name;          //instance variable String name
    
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age =age;
    }
    public void setName(String name)   //String n is local variale
    {
        this.name =name;           //this keyword refers to current object obj
    }
    

}

public class thisKeyword12 {

    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.setAge(19);
        obj.setName("Vedant");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());


    }

}
