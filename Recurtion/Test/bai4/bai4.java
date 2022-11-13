public class bai4 {
    public static int caua(int n){
        if(n==1){
            return 3;
        }
        else{
            return 2*n+1+(caua(n-1));
        }
    }

    public static int caub(int n){
        if(n==1){
            return 1;
        }
        else{
            return factorial(n) + caub(n-1);
        }
    }

    public static int factorial(int n){
        if(n==0 || n==1){
             return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args){
        System.out.println(caua(5));
        System.out.println(caub(4));
    }
}
