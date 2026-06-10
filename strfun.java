import java.util.Scanner;
public class strfun {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("max " +Math.max(a,b));
        System.out.println("min " +Math.min(a,b));
        System.out.println("abs " +Math.abs(a));
        System.out.println("pow " +Math.pow(a,b));
        System.out.println("round " +Math.round(a));
        System.out.println("ceil " +Math.ceil(a));
        System.out.println("floor " +Math.floor(a));
        System.out.println("sqrt " +Math.sqrt(a));
        sc.close();
    }
}*/

int sum=0;
int n=sc.nextInt();
for(int i=1;i<=n-1;i++){                         // perfect number
    if(n%i==0){
        sum=sum+i;
    }
}
    if(n==sum){
        System.out.println("perfect number");
    }
    else
    {
        System.out.println("not a perfect number");
    }

sc.close();
    }
}
