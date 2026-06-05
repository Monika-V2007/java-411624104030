import java.util.Scanner;

public class trianglepatternfun{

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==i)
                    System.out.print(i);
                else
                    System.out.print(i + " ");
                }
            System.out.println();
        }
    }
        public static void main(String[ ] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            pattern(n);
            sc.close();
    }
}
