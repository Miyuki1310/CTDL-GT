public class Node{
    Integer key;
    Node left,right;
    int height;

    public Node(Integer key){
        this.height = 0;
        this.left = this.right = null;
        this.key = key;
    }
}