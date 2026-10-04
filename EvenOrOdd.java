class EvenOrOdd {
    public static boolean isEven(int n){


        int rem = n%2;
        if(rem==0){
            return true;

        }
        else{
            return false;
        }


    }
    public static void main(String args[]){
        int n = 5;
        boolean result = isEven(n);
        if(result){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }

}