public class Test {
    public static void main(String[] args){
        AVL trees = new AVL();
        trees.root = trees.insert(trees.root, 15);
        trees.root = trees.insert(trees.root, 20);
        trees.root = trees.insert(trees.root, 21);
        trees.root = trees.insert(trees.root, 22);
        trees.root = trees.insert(trees.root, 14);
        trees.root = trees.insert(trees.root, 17);
        trees.root = trees.insert(trees.root, 23);
        trees.printTree(trees.root,"", true);
    }
}
