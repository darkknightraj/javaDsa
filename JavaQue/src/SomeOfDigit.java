import java.util.Scanner;

public class SomeOfDigit {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int ans=Sum(n);
        // System.out.println(ans);
        // sc.close();
        Sum(5);
        
    }
static void Sum(int n){
    if(n==0){
        return ;
    }
    //return (n%10)+Sum(n/10);
    System.out.println(n);
    Sum(n--);
}
}
