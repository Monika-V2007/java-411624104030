import java.util.Scanner;

public class validtriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a+b>c && b+c>a && a+c>b)
        {
           System.out.println("given sides form a triangle");
        }
        else
        {
            System.out.println("given sides not form a triangle");
        }
        sc.close();
    }
}


