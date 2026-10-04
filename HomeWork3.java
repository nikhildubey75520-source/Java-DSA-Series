public class HomeWork3 {
    //method to check whether number is even 
    static boolean isEven(int number){
        return number%2==0;

    }
    public static void main(String args[]){
        int number = 5;
        boolean result = isEven(number);
        if(result){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number+" is odd");
        }
    }
}
