
public class linrsearch28 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int target=7;
        int result = linearSearch(a,target); 
        if(result != -1)
            System.out.println(("Item found at : " + result));
        else
            System.out.println("Item not found!");
    }

   

    public static int linearSearch(int[] a,int target)
    {
        for(int i=0;i<a.length;i++){
            if(a[i]==target)
                return i;
          
        }
        return -1;
        
    }
}
