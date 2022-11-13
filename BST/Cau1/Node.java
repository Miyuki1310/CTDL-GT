public class Node{
    Integer key;
    Node left, right;

    public Node(Integer key){
        this.key = key;
        this.left = this.right = null;
    }

    public int getData(){
        return this.key;
    }
}