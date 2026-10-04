public class HomeWork7 {
    //method to verify pass-by-value
    static void updateValue(int x){
        x = 100;
        System.out.println("Value inside method:"+x);

    }
    public static void main(String args[]){
        int value = 50;
        System.out.println("Original value before method:"+value);
        updateValue(value);
        System.out.println("Original value after method:"+value);
    }
}
