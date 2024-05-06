public class Pattern10 {
    public static void Print(int n)
    {
        int star=1;
        for(int i=0;i<n;i++)
        {
            if(n%2==0)
                star=1;
            star=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(star);
                star=star-1;
            }
            System.out.println();
        }
    }
    public static void
}
