public class Selectionsort{
    public static void main(String[] args){
        int[] a = {5,3,6,9,7,8,1,4,2};
        quickSort(a,0,a.length-1);
        int i;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void Selectsort(int[] a){
        int i,j;
        int[] b = new int[a.length];
        int old_index;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        
    }

    public static void Bubblesort(int[] a){
        int i,j;
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length -i -1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void InserttionSort(int[] a){
        int i,j;
        for(i=1;i<a.length;i++){
            int key = a[i];
            j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key; 
        }
    }

    public static void Merge(int[] a, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int[] L1 = new int[n1];
        int[] L2 = new int[n2];
        
        for(int i=0;i<n1;i++){
            L1[i] = a[l+i];
        }

        for(int j =0;j<n2;j++){
            L2[j] = a[m+1+j];
        }

        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L1[i]<= L2[j]){
                a[k] = L1[i];
                i++;
            }
            else{
                a[k] = L2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            a[k] = L1[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = L2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] a, int first, int last){
        if(last>first){
            int middle = (last+first)/2;
            mergeSort(a, first, middle);
            mergeSort(a, middle+1, last);
            Merge(a, first, middle, last);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(high>low){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
}