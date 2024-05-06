import java.util.Scanner;

public class Pattern06 {
    static void pattern6(int n)
    {
        for(int i=0;i<n;i++)
        {
            int k=1;
            for(int j=n;j>i;j--)
            {
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        pattern6(n);
    }
}
