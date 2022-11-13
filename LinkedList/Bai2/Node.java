public class Node<Integer> {
    private Node<Integer> next;
    private int data;

    public Node(){
        
    }
    public Node(int data){
        this.data = data;
    }
    public Node(int data, Node<Integer> next){
        this.data = data;
        this.next = next;
    }
    public  Node<Integer> getNext(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public void setNext(Node<Integer> next){
        this.next = next;
    }

    public void setData(int data){
        this.data = data;
    }
}
