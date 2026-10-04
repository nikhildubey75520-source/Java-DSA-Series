import java .util.Scanner;
public class StringHomework6 {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enyter a string");
        String str = sc.nextLine();
        System.out.println("enter a character to find its frequency");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
            System.out.println("frequency of " + ch + " is=" + count);
        sc.close();
        }
    }
    
}
