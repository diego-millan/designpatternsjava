package patterns.state;

import java.util.ArrayList;
import java.util.List;

public class NodeSearchApp {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");

        a.addAdjacentNode(b);
        b.addAdjacentNode(c);
        c.addAdjacentNode(d);
        d.addAdjacentNode(b);
        a.addAdjacentNode(e);
        e.addAdjacentNode(f);
        f.addAdjacentNode(c);
        f.addAdjacentNode(g);
        f.addAdjacentNode(h);
        a.addAdjacentNode(h);

        List<Node> nodeList = new ArrayList<>();
        a.depthSearch(nodeList);

        for (Node currentNode : nodeList) {
            System.out.println(currentNode);
        }
    }
}
