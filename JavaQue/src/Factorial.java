import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int res=sum(n);
        System.out.println(res);
        sc.close();

    }
//     static int fact(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         return n*fact(n-1);
//     }

// }
static int sum(int n){
    if(n==0){
        return 0;
    }
   
    return n+sum(n-1);
}
}
