package patterns.state;

import java.util.List;

public class WhiteNode extends NodeColor {
    public void search(Node node, List<Node> nodeList) {
        node.setNodeColor(new GreyNode(), nodeList);
    }
}
