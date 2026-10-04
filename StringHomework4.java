// wap to print no of consonents in a string.
import java.util.Scanner;
public class StringHomework4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >='a' && ch <='z' && ch !='a' && ch !='e' && ch !='i' && ch !='o' && ch !='u'){
                count++;

            }



    }
    System.out.println("number of consonents=" + count);
    sc.close();

    
    }
}    
