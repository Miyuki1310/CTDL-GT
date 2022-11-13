public class bai7{
    public static int minimum(int a[], int index){
        if(index == (a.length-1))
        {
            return a[index];
        }
        return Math.min(a[index], minimum(a, index+1));
    }

    public static int sum(int a[], int index){
        if(index == a.length-1){
            return a[index];
        }
        return a[index]+sum(a,index+1);
    }

    public static int countEven(int a[], int index){
        if(index == a.length){
            return 0;
        }
        int results;
        if(a[index]%2==0){
            results=1;
        }
        else{
            results=0;
        }
        return results + countEven(a,index+1);
    }

    public static void main(String[] args){
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(minimum(a,0));
        System.out.println(sum(a,0));
        System.out.println(countEven(a,0));
    }
}