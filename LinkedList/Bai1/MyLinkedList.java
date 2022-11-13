public class MyLinkedList<E> implements LinkedListInterface<E>{
    private Node<E> head;
    private int numNode;
     public MyLinkedList(){
        this.head = null;
        this.numNode = 0;
    }

    @Override
    public void addFirst(E item){
        head = new Node<E>(item, head);
        numNode++;
    }

    @Override
    public void addAfter(E item, Node<E> prev){
        if(prev == null){
            addFirst(item);
        }
        else{
            Node<E> newNode = new Node<E>(item, prev.getNext());
            prev.setNext(newNode);
            numNode++;
        }
    }

    @Override
    public void addLast(E item){
        if(head == null)
        {
            head = new Node<E>(item, head);
        }
        else{
            Node<E> temp  = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            Node<E> newNode = new Node<E>(item, null);
            temp.setNext(newNode);
            numNode++;
        }
    }

    @Override
    public E removeFirst(){
        if(head == null){
            return null;
        }
        else{
            Node<E> temp = head;
            head = head.getNext();
            numNode--;
            return temp.getData();
        }
    }

    @Override
    public E removeAfter(Node<E> curr){
        if(curr == null){
            return null;
        }
        else{
            Node<E> delNode = curr.getNext();
            if(delNode != null){
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            }
            else{
                return null;
            }
        }
    }

    @Override
    public E removeLast(){
        if(head == null)
        {
            return null;
        }
        else{
            Node<E> delNode = head;
            Node<E> prevNode = null;
            if(delNode.getNext()==null){
                return removeFirst();
            }
            else{
                while(delNode.getNext()!=null)
                {
                    prevNode = delNode;
                    delNode = delNode.getNext();
                }
                prevNode.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            }
        }
    }

    @Override
    public void print(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp != null){
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    @Override
    public boolean isEmpty(){
        if(numNode==0){
            return true;
        }
        return false;
    }

    @Override
    public E getFirst(){
        if(head == null)
        {
            return null;
        }
        else{
            return head.getData();
        }
    }

    @Override
    public Node<E> getHead(){
        if(head == null){
            return null;
        }
        else{
            return head;
        }
    }

    @Override
    public int size(){
        return this.numNode;
    }

    @Override
    public boolean contains(E item){
        if(head == null)
        {
            return false;
        }
        else{
            Node<E> temp = head;
            while(temp!=null)
            {
                if(temp.getData().equals(item)){
                    return true;
                }
                temp = temp.getNext();
            }
            return false;
        }
    }

    @Override
    public E removeCurr(Node<E> curr){
        if(head == null){
            return null;
        }
        else{
            if(head.getNext()==null){
                return removeFirst();
            }
            else{
                Node<E> prevNode = null;
                Node<E> delNode = head;
                while(delNode != curr){
                    prevNode = delNode;
                    delNode = delNode.getNext();
                }
                prevNode.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            }
        }
    }

}
