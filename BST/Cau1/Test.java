public class Test {
    public static void main(String[] args){
        BST myBST = new BST();
        myBST.setRoot(myBST.insert(myBST.root,5));
        myBST.setRoot(myBST.insert(myBST.root,4));
        myBST.setRoot(myBST.insert(myBST.root,7));
        myBST.setRoot(myBST.insert(myBST.root,3));
        myBST.LNR(myBST.root);
    }
}
