public class bai3 {
    public static boolean checkPrime(int n, int d){
        if(d==n){
            return true;
        }
        else{
            if(n%d ==0){
                return false;
            }
            return checkPrime(n, d+1);
        }
    }

    public static void main(String[] args){
        System.out.println(checkPrime(111, 2));
        System.out.println(checkPrime(7, 2));
        System.out.println(checkPrime(9, 2));
        System.out.println(checkPrime(97, 2));
    }
}
