public class cauc {
    public static int countDigits(int n){
        if(n<0){
            return 0;
        }
        else{
            int i;
            if(n==0){
                return 1;
            }
            else{
                int results=0;
                while(n!=0){
                    results+=1;
                    n=n/10;
                }
                return results;
            }
        }
    }
    public static void main(String[] args){
        System.out.println(countDigits(48));
        System.out.println(countDigits(1));
        System.out.println(countDigits(0));
        System.out.println(countDigits(123456));
        System.out.println(countDigits(256));
        System.out.println(countDigits(4299));
        System.out.println(countDigits(-54));
    }
}
