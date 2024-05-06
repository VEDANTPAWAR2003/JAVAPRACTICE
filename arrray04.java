public class arrray04 {
    public static void main(String arg[])
    {
        int num[]={1,2,3,4,5};
        System.out.println(num[1]);

        int num1[] = new int[4];       //Dynamically array
        num1[0]=0;
        num1[1]=1;
        num1[2]=2;
        num1[3]=3;
        
        for(int i=0;i<4;i++)
           System.out.println(num1[i]);
    }
}
