public class MyLinkedList<Integer>{
    private Node<Integer> head;
    private int numNode;

    public MyLinkedList(){

    }
    public void add(int data){
        if(head == null){
            head = new Node<Integer>(data,head);
            numNode++;
        }
        else{
            Node<Integer> temp = head;
            while(temp.getNext()!= null)
            {
                temp = temp.getNext();
            }
            Node<Integer> newNode = new Node<Integer>(data,null);
            temp.setNext(newNode);
            numNode++;
        }
    }

    public void addBefore(Node<Integer> after, int item){
        Node<Integer> temp = head;
        while(temp.getNext() != after){
            temp = temp.getNext();
        }
        Node<Integer> newNode = new Node<Integer>(item, after);
        temp.setNext(newNode);
        numNode++;
    }

    public void print(){
        Node<Integer> temp = head;
        System.out.print("List: ");
        while(temp!= null){
            System.out.print(temp.getData()+ " ");
            temp=temp.getNext();
        }
    }

    public boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        else if(num >2){
            int i;
            int count =0;
            for(i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public int countPrime(){
        int count = 0;
        Node<Integer> temp = head;
        while(temp!= null){
            if(isPrime(temp.getData())==true){
                count+=1;
            }
            temp = temp.getNext();
        }
        return count;
    }

    public int countEven(){
        int count = 0;
        Node<Integer> temp = head;
        while(temp!=null){
            if(temp.getData() % 2 == 0){
                count +=1;
            }
            temp=temp.getNext();
        }
        return count;
    }

    public void addBeforeFirstEvenNumber(int x)
    {
        Node<Integer> temp = head;
        while(temp!=null){
            if(temp.getData() % 2 ==0){
                break;
            }
            temp = temp.getNext();
        }
        addBefore(temp, x);

    }

    public int findMax(){
        Node<Integer> temp = head;
        int max = head.getData();
        while(temp!=null){
            if(max< temp.getData()){
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    public void sortList(){
        Node<Integer> temp = head;
        while(temp!=null){
            Node<Integer> temp1 = temp.getNext();
            while(temp1!=null){
                if(temp.getData() > temp1.getData()){
                    int temp2 = temp.getData();
                    temp.setData(temp1.getData());
                    temp1.setData(temp2);
                }
                temp1 = temp1.getNext();
            }
            temp = temp.getNext();
        }
    }

    public void reverseList(){
        Node<Integer> temp = head;
        while(temp!= null && temp.getNext() != null){
            Node<Integer> temp1 = temp.getNext();
            temp.setNext(temp1.getNext());
            temp1.setNext(head);
            head = temp1; 
        }
    }

    
}