public class sample {
    public static void main(String[] args){
        System.out.print(ispalindrome(121));

    }
    public static int countdigits(int n){
        int count=0;
        while(n>0)
        {
          count++;
          n=n/10;
        }
        return count;
    }
    public static boolean ispalindrome (int num){
     int rev=0;
     int temp=num;
     while(num>0){
        int last=num%10;
        rev=rev*10+last;
        num=num/10;
    }
        if(rev==temp)
           return true;
        else{
            return false;
    }
 }
}
