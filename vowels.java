import java.util.Scanner;
public class vowels {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String S = sc.next();
       int vowels=0;
       int cons=0;
       int digits=0;
       int letters=0;
       for(int i=0;i<S.length();i++)
       {
         char ch = S.charAt(i);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            vowels++;
        }
        else
        {
            cons++;
        }
        if(Character.isDigit(ch))
        {
          digits++;
        }
        if(Character.isLetter(ch))
        {
          letters++;
        }
        }
        System.out.println("vowels "+vowels);
        System.out.println("cons "+cons);
        System.out.println("digits "+digits);
        System.out.println("letters "+letters);
        sc.close();
    }
}        