public class HomeWork6 {
    //method overloading
    static void display(int number){
        System.out.println("integer:"+number);

    }
    static void display(String text){
        System.out.println("String :"+text);
    }
    public static void main(String args[]){
        display(50);
        display("Hello java");
    }
}
