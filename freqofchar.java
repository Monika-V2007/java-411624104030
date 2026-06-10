import java.util.Scanner;
public class freqofchar {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    /*int target='a';                                  //frequency of characters
    int count=0;
    for(int i=0;i<S.length();i++){
    char ch = S.charAt(i);
      if(target==ch)
      {
        count++;        
      }
    }
      System.out.println(count);
      sc.close();
    }
}*/

  /*for(int i=S.length()-1;i>=0;i--)
    {
        System.out.print(S.charAt(i));
    }
    sc.close();
    }
}
*/

     String rev = "";
        for(int i = S.length() - 1; i >= 0; i--) {
            rev = rev + S.charAt(i);
        }
        if(S.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}