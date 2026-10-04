//count vowels in a string.
public class StringHomework3 {
    static void printString(String str){
        int n = str.length();
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
    static int getVowelsCount(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }
    static void main(){
        String str = "LOVE";
        printString(str);
        System.out.println(getLengthOfString(str));
        System.out.println(getVowelsCount(str));
    }
    
}
