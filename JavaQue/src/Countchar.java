import java.util.Scanner;

public class Countchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
       // char [] charArray = str.toCharArray(); 
        Boolean hasUpper=false;
        Boolean lower= false;
        Boolean mixed = false;
        for(char ch :str.toCharArray()){
            if(Character.isWhitespace(ch)){
                continue;
            }
            if(Character.isUpperCase(ch)){
             hasUpper=true;
            }
            else if (Character.isLowerCase(ch)){
                lower=true;
            }
            else{
                mixed =true;
            }
          
        }
        sc.close();
        if(hasUpper && !lower && !mixed){
            System.out.println("all upper case");
        }else if(!hasUpper && lower && !mixed){
            System.out.println("alll lower case");
        }else{
            System.out.println(" mixed case");
        }

    }

}
