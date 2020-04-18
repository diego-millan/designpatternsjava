package patterns.state;

import java.util.List;

public class BlackNode extends NodeColor {
    public void update(Node node, List<Node> nodeList) {
        nodeList.add(node);
    }
}
