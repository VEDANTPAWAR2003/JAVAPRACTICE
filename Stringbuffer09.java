public class Stringbuffer09 {
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Vedant");
        System.out.println(sb.capacity());        //length and capacity are different length give the actual length of the string and capacity gives the length with 16 space extra to reduce the the buffer!
        System.out.println(sb.length());
        
    }
}