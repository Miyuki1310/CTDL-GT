public class cauc {
    public static int countDigits(int n){
        if(n<0){
            return 0;
        }
        else if(n==0 || n/10==0){
            return 1;
        }
        else{
            return 1+countDigits(n/10);
        }
    }

    public static void main(String[] args){
        System.out.println(countDigits(123456));
        System.out.println(countDigits(0));
        System.out.println(countDigits(56));
        System.out.println(countDigits(159));
    }
}
