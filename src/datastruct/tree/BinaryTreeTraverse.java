package datastruct.tree;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class BinaryTreeTraverse {
    public BinaryTreeTraverse() {

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();

        node1.setData(1);
        node2.setData(2);
        node3.setData(3);
        node4.setData(4);

        node1.makeLeftSubTree(node1, node2);
        node1.makeRightSubTree(node1, node3);
        node2.makeLeftSubTree(node2, node4);

        inOrderTraverse(node1);
    }

    public void inOrderTraverse(Node node){
        if(node==null){
            return;
        }else{
            inOrderTraverse(node.left);
            System.out.println(node.data);
            inOrderTraverse(node.right);

        }


    }


    public static void main(String[] args) {
        new BinaryTreeTraverse();
    }
}