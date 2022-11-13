public class caud {
    //Cách1
    public static int UCLN1(int a, int b){
        if(a==0 || b==0){
            return a+b;
        }
        else{
            if(a==b){
                return a;
            }
            else{
                if(a>b){
                    return UCLN1(a-b,b);
                }
                else{
                    return UCLN1(a,b-a);
                }
            }
        }
    }
    //Cách 2
    public static int UCLN2(int a, int b){
        if(a==0){
            return b;
        }
        return UCLN2(b%a , a);
    }
    public static void main(String[] args){
        System.out.println(UCLN1(63,42));
        System.out.println(UCLN2(63,42));
    }
}
