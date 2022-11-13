public class Heapmin {
    int[] heap;
    int heapSize;
    int maxSize;

    public Heapmin(int capacity){
        heapSize = 0;
        this.maxSize = capacity+1;
        heap = new int[maxSize];
        heap[0] = -1;
    }

    private int parent(int i){
        return i/2;
    }

    private int lef(int i){
        return i*2;
    }
    private int right(int i){
        return 2*i+1;
    }

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int key){
        if(heapSize == maxSize){
            return;
        }
        heapSize +=1;
        heap[heapSize] = key;
        shilfup(heapSize);
    }

    private void shilfup(int i){
        while(i>1 && heap[parent(i)] > heap[i]){
            swap(parent(i),i);
            i = parent(i);
        }
    }

    public int extractMin(){
        if(heapSize == 0){
            return -1;
        }
        int max = heap[1];
        heap[1] = heap[heapSize];
        heapSize= heapSize-1;
        shilfdown(1);
        return max;
    }

    private void shilfdown(int i){
        while(i<=heapSize){
            int max = heap[i];
            int max_id = i;
            if(lef(i) <= heapSize && max > heap[lef(i)]){
                max = heap[lef(i)];
                max_id = lef(i);
            }
            if(right(i) <= heapSize && max > heap[right(i)]){
                max = heap[right(i)];
                max_id = right(i);
            }
            if(max_id != i){
                swap(max_id,i);
                i = max_id;
            }

            else{
                break;
            }
        }
    }

    public void print(){
        int i;
        for(i=1;i<=heapSize;i++){
            System.out.println(heap[i]);
        }
    }
}
