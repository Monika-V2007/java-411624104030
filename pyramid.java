public class pyramid {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        //for(int i=n;i>=1;i--)               // for inverted pyramid 
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //for(int j=1;j<=i;j++)                //for space pyramid
            for(int j=1;j<=2*i-1;j++)                //for close pyramid and inverted pyramid
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

