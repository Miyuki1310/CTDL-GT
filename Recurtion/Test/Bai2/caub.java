public class caub {
    public static int compute(int x, int n){
        if(n==0){
            return 1;
        }
        else{
            return x*compute(x,n-1);
        }
    }

    public static void main(String[] args){
        System.out.println(compute(5, 3));
    }
}
