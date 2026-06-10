/*import java.util.Scanner;
public class array {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=5;
        int[]marks=new int[n];
        for(int i=0;i<marks.length;i++){  
            marks[i]=sc.nextInt(); 
        }
        int sum=0;                            // sum
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
            // int avg=sum/n;          //avg
     System.out.print(avg);
    sc.close();
    }
}*/


/*import java.util.Scanner;
public class array {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=5;
        int[]marks=new int[n];
        for(int i=0;i<marks.length;i++){       // max and min
            marks[i]=sc.nextInt(); 
        }
        //int max=0;
        int min=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }
     System.out.print(min);
    sc.close();
    }
}*/

/*
import java.util.Scanner;
public class array {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=5;
        int[]marks=new int[n];
        for(int i=0;i<marks.length;i++){      
            marks[i]=sc.nextInt(); 
        }
        int evencount=0;
        int oddcount=0;                          
        for(int i=0;i<marks.length;i++){
            if(marks[i]%2==0){
                evencount++;                   //evencount
            }
           else{
                oddcount++;                   //oddcount
            }
        }
     System.out.println("evencount " +evencount);
     System.out.println("oddcount " +oddcount);
    sc.close();
    }
}
*/

/*
import java.util.Scanner;
public class array {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=5;
        int[]marks=new int[n];                
        for(int i=0;i<marks.length;i++){  
            marks[i]=sc.nextInt();             // reverse number 
        }                                    // in array
        for(int i=n-1;i>=0;i--){
          System.out.print(marks[i]+" ");
        }
    sc.close();
    }
}
*/

/*
import java.util.Scanner;
public class array {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=5;
        int[]marks=new int[n];                
        for(int i=0;i<marks.length;i++){  
            marks[i]=sc.nextInt();           
        }             
        int first=marks[0];
        int second=marks[1];                  //second max
        if(second>first)
        {
            int temp=first;
            second=first;
            second=temp;
        }
        for(int i=2;i<marks.length;i++){
          if (marks[i] > first) {
                second = first;
                first = marks[i];
            } else if (marks[i] > second) {
                second = marks[i];
            }
        }
        System.out.println("first max " +first);
        System.out.println("second max " +second);
    sc.close();
    }
}
*/

/* 
public class array
{
    public static void main(String[] args)
    {
        int[] marks={20,30,50,10,60};
        int i=0;
        int j=marks.length-1;
        while(i<j)
        {                                   //reverse array
            int temp=marks[i];
            marks[i]=marks[j];
            marks[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }

    }
}
*/

/*
import java.util.Scanner;
public class array {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=5;
        int[]marks=new int[n];
        for(int i=0;i<marks.length;i++){      
            marks[i]=sc.nextInt();
        } 
        int count=0;                     //count repeated values
        int target=5;                         
        for(int i=0;i<marks.length;i++){
            if(target==marks[i])
            {
               count++;
            }
        }
        System.out.println("count "+ count);
  }
}
*/