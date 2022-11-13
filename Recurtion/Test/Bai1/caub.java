public class caub {
    public static int computeExpresion(int n, int x){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return x;
        }
        else{
            return x* computeExpresion(n-1, x);
        }
    }

    public static void main(String[] args){
        System.out.println(computeExpresion(3, 4));
    }
}
