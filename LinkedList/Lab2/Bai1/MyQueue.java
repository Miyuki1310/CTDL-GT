public class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int numNode;

    public MyQueue(){

    }

    public void enQueue(E item){
        if(front==null){
            front = new Node<E>(item, null);
            rear = new Node<E>(item, null);
            numNode++;
        }
        else{
            Node<E> temp = front;
            while(temp.getNext()!= null){
                temp=temp.getNext();
            }
            Node<E> newNode = new Node<E>(item, null);
            temp.setNext(newNode);
            rear = newNode;
            numNode++;
        }
    }

    public void print(){
        if(front==null){
            System.out.println("List is empty");
        }
        else{
            Node<E> temp = front;
            while(temp!=null){
                System.out.print(temp.getData()+ " ");
                temp=temp.getNext();
            }
        }
    }

    public E deQueue(){
        Node<E> temp = front;
        front = front.getNext();
        return temp.getData();
    }

    public int size()
    {
        return this.numNode;
    }
    public boolean contains(E item){
        Node<E> temp = front;
        while(temp!=null){
            if(temp.getData().equals(item)){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public boolean isEmpty(){
        if(numNode==0){
            return true;
        }
        return false;
    }

    public E getFront(){
        return front.getData();
    }
}
