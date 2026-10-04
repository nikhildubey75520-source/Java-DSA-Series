public class HomeWork5 {
    //method to calculate percentage
    static double calculatePercentage(int obtained,int total){
        return ((double)obtained/total)*100;


    }
    public static void main(String args[]){
        int obtained = 450;
        int total = 500;
        System.out.println("percentage is:"+calculatePercentage(obtained,total));
    }
}
