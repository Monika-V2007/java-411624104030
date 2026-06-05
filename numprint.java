import java.util.Scanner;
public class numprint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int i=1;
        for(i=1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();

    }
}

