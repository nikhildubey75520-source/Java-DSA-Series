import java.util.Scanner;
public class StringHomework7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch !=' '){
                result = result + ch;
            }
    }
    System.out.println("string after removing spaces is=" + result);
    sc.close();
    
    }
}    
