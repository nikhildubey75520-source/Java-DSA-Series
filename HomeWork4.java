public class HomeWork4 {
    //method to return larger number
    static int getMaximum(int a, int b){
        return(a>b)?a:b;

    }
    public static void main(String args[]){
        int a =5;
        int b =7;
        System.out.println("larger number is: "+getMaximum(a,b));
    }
}
