import java.util.Scanner;
public class StringHomework8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        Boolean isDigit=true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch<'0' || ch>'9'){
                isDigit=false;
                break;
            }
        }
        if(isDigit){
            System.out.println("string is numeric");
        }
        else{
            System.out.println("string is not numeric");
        }
        sc.close();
    }
    
}
