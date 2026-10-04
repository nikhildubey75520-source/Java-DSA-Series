// Count length of string without length().
public class StringHomework2 {
    static void printString(String str){
        int n =str.length();
        for(int i=0;i<n;i++){

            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
    static int getLengthOfString(String str){
    
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;


    
   }
   static void main(){
    String str ="LOVE";
    System.out.println(getLengthOfString(str));
   }


}
    
    