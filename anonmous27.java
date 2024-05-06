//anonmous inner class
//writing the method of another class in the main class and it will execute the main class method 
class A{
    public void show(){
        System.out.println("In show A");
    }
}
public class anonmous27{
    public static void main(String[] args) {
        A obj = new A(){
           public void show(){
        System.out.println("In new show A");
    }
        };
        obj.show();
    }
    
}
    

