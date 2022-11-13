public class Factorial{
    public static int factorial(int x){
        int results=1;
        int i;
        for(i=2;i<=x;i++){
            results = results*i;
        }
        return results;
    }
    public static void main(String[] args){
        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }
}