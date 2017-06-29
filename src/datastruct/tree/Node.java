package datastruct.tree;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class Node {
    public int data;
    public Node left;
    public Node right;

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftSubTree() {
        return left;
    }

    public Node getRightSubTree() {
        return right;
    }

    public void makeLeftSubTree(Node main, Node sub) {
        if (main.left != null) {
            main.left = null;
        }
        main.left = sub;
    }

    public void makeRightSubTree(Node main, Node sub) {
        if (main.right != null) {
            main.right = null;
        }
        main.right = sub;
    }

    public Node makeTreeNode() {
        Node n = new Node();
        n.left = null;
        n.right = null;
        return n;

    }

}