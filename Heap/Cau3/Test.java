public class Test {
    public static void heapsortasc(int[] a){
        int i;
        Heap arr = new Heap(a.length);
        for(i=0;i<a.length;i++){
            arr.insert(a[i]);
        }
        for(i=a.length-1;i>=0;i--){
            a[i] = arr.extractMax();
        }
    }
    public static void heapsortdsc(int[] a){
        int i;
        Heap arr = new Heap(a.length);
        for(i=0;i<a.length;i++){
            arr.insert(a[i]);
        }
        for(i=0; i<a.length;i++){
            a[i] = arr.extractMax();
        }
    }
    public static void main(String[] args){
        int[] arr = {7,5,6,4,9,8,2,3,1};
        heapsortdsc(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
