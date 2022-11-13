public class Test {
    public static void heapsort(int[] a){
        int i;
        Heapmin arr = new Heapmin(a.length);
        for(i=0;i<a.length;i++){
            arr.insert(a[i]);
        }
        for(i=a.length-1;i>=0;i--){
            a[i] = arr.extractMin();
        }
    }
    public static void main(String[] args){
        int[] arr = {7,5,6,4,9,8,2,3,1};
        heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
