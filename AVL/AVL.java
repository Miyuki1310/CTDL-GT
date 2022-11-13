public class AVL {
    public Node root;

    public AVL(){
        this.root = null;
    }

    public Node insert(Node x, Integer key){
        if(x==null){
            x =  new Node(key);
        }
        else{
            int cmp = key.compareTo(x.key);
            if(cmp>0){
                x.right = insert(x.right,key);
            }
            else if(cmp<0){
                x.left = insert(x.left, key);
            }
            else{
                x.key = key;
            }
            x.height = 1 + Math.max(height(x.left), height(x.right));
        }
        x = balance(x);
        return x;
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void LNR(Node x) {
        if (x == null) {
          return;
        }
        LNR(x.left);
        System.out.print(x.key + " ");
        LNR(x.right);
    }

    public int checkBalance(Node x){
        return height(x.left)-height(x.right);
    }

    public Node rotateLeft(Node x){
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1+ Math.max(height(x.left), height(x.right));
        y.height = 1+ Math.max(height(y.left), height(y.right));
        return y;
    }

    public Node rotateRight(Node x){
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    public Node rotateRightLeft(Node x){
        x.right = rotateRight(x.right);
        return rotateLeft(x);
    }

    public Node rotateLeftRight(Node x){
        x.left = rotateLeft(x.left);
        return rotateRight(x);
    }

    public void printTree(Node curr, String indent, boolean last) {
        if (curr == null)
          return;
    
        System.out.print(indent);
        if (last) {
          System.out.print("R----");
          indent += "   ";
        } else {
          System.out.print("L----");
          indent += "|  ";
        }
        System.out.println(curr.key);
        printTree(curr.left, indent, false);
        printTree(curr.right, indent, true);
    
    }

    private Node balance(Node x){
        if(checkBalance(x) < -1){
            if(checkBalance(x.right)>0){
                x.right = rotateRight(x.right);
            }
            x = rotateLeft(x);
        }
        else if(checkBalance(x)>1){
            if(checkBalance(x.left)<0){
                x.left = rotateLeft(x.left);
            }
            x = rotateRight(x);
        }
        return x;
    }
}
