public class caud {
    public static boolean checkPrime(int n){
        if(n<2)
        {
            return false;
        }
        else if(n==2){
            return true;
        }
        else{
            int i;
            for(i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(3));
        System.out.println(checkPrime(4));
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(9));
        System.out.println(checkPrime(11));
        System.out.println(checkPrime(15));
        System.out.println(checkPrime(37));
        System.out.println(checkPrime(43));
    }
}
