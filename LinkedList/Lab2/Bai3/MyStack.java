public class MyStack<E> implements StackInterface<E> {
    private Node<E> top;
    public int numNode;

    public MyStack(){
        top = null;
        numNode = 0;
    }
    
    public void push(E item){
        top = new Node<E>(item,top);
        numNode++;
    }

    public void print(){
        Node<E> temp = top;
        System.out.print("List: ");
        while(temp !=null){
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public E pop(){
        Node<E> temp = top;
        top = top.getNext();
        numNode--;
        return temp.getData();
    }

    public int size(){
        return this.numNode;
    }

    public boolean contains(E item){
        if(top == null){
            return false;
        }
        else{
            Node<E> temp = top;
            while(temp!=null){
                if(temp.getData().equals(item)){
                    return true;
                }
                temp = temp.getNext();
            }
            return false;
        }
    }

    public boolean isEmpty(){
        if(numNode==0){
            return true;
        }
        return false;
    }

    public E getPeek(){
        return top.getData();
    }
}
