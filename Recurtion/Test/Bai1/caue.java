public class caue {
    public static int checkGCD(int a, int b){
        int max = 0;
        if(a<b){
            max = b;
        }
        else{
            max = a;
        }
        int i;
        for(i=max;i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(checkGCD(42, 63));
    }
}
