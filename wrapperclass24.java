/*Wrapper Class
 * int =Integer
 * char=Character
 * double=Double
 * 
 * Integer.parseInteger(Str);
 */


public class wrapperclass24 {
    public static void main(String[] args)
    {
        int n =10;
        Integer n1 =n;               //Autoboxing

        int n2 = n1.intValue();           //Auto-unboxing
        //or int n2 = n1;
        System.out.println(n2);

        String st="10";
        int num = Integer.parseInt(st);
        System.out.println(num);

    }
}
