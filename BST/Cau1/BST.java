public class BST {
    public Node root;

    public BST(){
        root = null;
    }

    public void setRoot(Node node){
        this.root = node;
    }

    public Node insert(Node x, Integer key){
        if(x==null){
            return new Node(key);
        }
        else{
            int cmp = key.compareTo(x.key);
            if(cmp>0){
                x.right =  insert(x.right,key);
            }
            else if( cmp < 0){
                x.left = insert(x.left,key);
            }
            else{
                x.key = key;
            }
            return x;
        }
    }

    public void NLR(Node x) {
        if (x == null) {
          return;
        }
        System.out.print(x.getData() + " ");
        NLR(x.left);
        NLR(x.right);
    }

    public void LNR(Node x) {
        if (x == null) {
          return;
        }
        LNR(x.left);
        System.out.print(x.getData() + " ");
        LNR(x.right);
    }

    public void printASC(){
        LNR(this.root);
    }
    


}
