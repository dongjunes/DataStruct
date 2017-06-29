package datastruct.tree;

/**
 * Created by dongjunekim on 2017-06-29.
 */
public class Main {
    public Main() {

        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();

        node1.setData(1);
        node2.setData(2);
        node3.setData(3);

        node1.makeLeftSubTree(node1, node2);
        node1.makeRightSubTree(node1, node3);

        System.out.println(node1.getData());
        System.out.println(node2.getData());
        System.out.println(node3.getData());


    }

    public static void main(String[] args) {
        new Main();
    }
}